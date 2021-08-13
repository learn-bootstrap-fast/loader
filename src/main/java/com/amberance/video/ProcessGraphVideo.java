package com.amberance.video;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.amberance.AmberanceMainApplication;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProcessGraphVideo {
	
	public static String process(String filePath) {
		
		File file = new File(filePath);
		String username = "";
		try {
			ObjectMapper om = new ObjectMapper();
			GraphVideo root = om.readValue(new File(filePath), GraphVideo.class);
			username = root.getNode().getIphone_struct().getUser().getUsername();
			String text = null;
			for (Edge data : root.getNode().getEdge_media_to_caption().getEdges()) {
				text = data.node.text;
			}

			try {
				for (Object data : root.getNode().getIphone_struct().getSaved_collection_ids()) {
					text = data.toString();
				}
			} catch (Exception e) {
				// System.err.println(e.getClass() + "Error generating collection ids. Probably
				// iphone struct issue " + filePath);
			}
			if (username == null || username.length() == 0) {
				AmberanceMainApplication.badCount++;
				AmberanceMainApplication.badUsername++;
				return "";
			}

			Pattern MY_PATTERN = Pattern.compile("#(\\S+)");
			Matcher mat = MY_PATTERN.matcher(text);

			while (mat.find()) {
				AmberanceMainApplication.hashtags.add(mat.group(1));
			}

			System.out.println("Username: " + username);
			System.out.println("Text: " + text);

		} catch (Exception e) {
			AmberanceMainApplication.badCount++; 
		}
		return username;
	}

}
