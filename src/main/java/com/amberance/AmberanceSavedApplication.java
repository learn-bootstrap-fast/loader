package com.amberance;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.amberance.video.ProcessGraphVideo;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AmberanceSavedApplication {
	public static int badCount = 0;
	public static int badUsername = 0;
	public static int badText = 0;
	public static int videoCount;
	public static int singleImageCount;
	public static int multiImageCount;
	public static HashSet<String> hashtags = new HashSet<String>();

	public static void main(String[] args) throws Exception {
		loopThroughAllJsonFiles();

	}

	public static void loopThroughAllJsonFiles() throws Exception {
		String dirLocation = "C:\\_instaloader\\austin.dylan_\\saved";
		String fileExtension = "json";
		String username = "";
		List<String> result = null;
		try (Stream<Path> walk = Files.list(Paths.get(dirLocation))) {
			result = walk.filter(p -> Files.isDirectory(p))
					// this is a path, not string,
					// this only test if path end with a certain path
					// .filter(p -> p.endsWith(fileExtension))
					// convert path to string first
					.map(p -> p.toString().toLowerCase())
					// .filter(f -> f.endsWith(fileExtension))
					.collect(Collectors.toList());
		}

		for (String fullPath : result) {
			// System.out.println(fullPath);
			String[] tokens = fullPath.split("\\\\");
			String jsonFilePath = fullPath + "\\" + tokens[tokens.length - 1] + ".json";
			// System.out.println(jsonFilePath);

//			if( folderHasSingleFileOfType(fullPath, ".jpg")) {
//				singleImageCount++;
//				File index = new File(fullPath);
//				String[] entries = index.list();
//				if (entries!=null) {
//					for(String s: entries){
//					    File currentFile = new File(index.getPath(),s);
//					    currentFile.delete();
//					}
//				}
//				index.delete();
//				//continue;
//				
//			}
			username="";
			if( folderHasSingleFileOfType(fullPath, ".mp4") && isFileType(jsonFilePath, "\"__typename\": \"GraphVideo\",")) {
				username = ProcessGraphVideo.process(jsonFilePath);
				videoCount++;
			}
			else {
				//System.out.println("SIDECAR!!!");
				if( isFileType(jsonFilePath, "\"__typename\": \"GraphSidecar\",")) {
					multiImageCount = multiImageCount+1;
					username = processMultiImageFile(jsonFilePath);
				}
			}
			writePostFile(fullPath, username);
		}

		System.out.println("Badcount was: " + badCount + " and bad username was " + badUsername);
		Iterator<String> it = hashtags.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//System.out.println("V : " + videoCount + ":  S : " + singleImageCount + " M : " + multiImageCount);
	}
	


	public static boolean folderHasSingleFileOfType(String jsonFilePath, String extension) {
		try {
			Stream<Path> files = Files.list(Paths.get(jsonFilePath));
			long amountOfFiles = files.map(Path::toFile).filter(e->e.getName().endsWith(extension)).count();
			if (amountOfFiles==1) {
				return true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
        return false;
	}

	public static boolean isFileType(String jsonFilePath, String searchTerm) {

        try (Stream<String> stream = Files.lines(Paths.get(jsonFilePath))) {
        	
        	if (stream.filter(line -> line.contains(searchTerm)).count() > 0) {
        		return true;
        	};
        	
        	
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
	}

	public static String processMultiImageFile(String filePath) {

		File file = new File(filePath);
		String username=null;
		String text=null;
		try {
			ObjectMapper om = new ObjectMapper();
			GraphSidecar root = om.readValue(new File(filePath), GraphSidecar.class);
			
			//String username = root.getNode().getUsername();

			try {
				String ownerUsername = root.getNode().getOwner().getUsername();
				username = root.getNode().getIphone_struct().getUser().getUsername();
				text = root.getNode().getIphone_struct().getCaption().getText();
			} catch (Exception e) {
				username = root.getNode().getOwner().getUsername();
				for (Edge edge : root.getNode().getEdge_media_to_caption().edges) {
					text = edge.getNode().getText();
					if (text.length()>1) {
						break;
					}
				}
			}

			if (username == null || username.length()==0) {
				badCount++;
				badUsername++;
				return "";
			}
			
			if (text == null || text.length()==0) {
				badCount++;
				badText++;
				//return;
			} else {
				Pattern MY_PATTERN = Pattern.compile("#(\\S+)");
				Matcher mat = MY_PATTERN.matcher(text);

				while (mat.find()) {
					hashtags.add(mat.group(1));
				}
			}



			System.out.println("Username: " + username);
			System.out.println("Text: " + text);

		} catch (Exception e) {
			badCount++; 
		}
		return username;
	}
	
	
	public static void writePostFile(String path, String username) {
	    try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(path+"\\postdata.txt"));
			writer.write(Phrases.generatePostData(username));
			writer.close();
		} catch (IOException e) {
			System.err.println(e.getClass());
		}
		
	}
}

