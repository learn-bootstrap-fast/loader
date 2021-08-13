package com.amberance;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;

@SpringBootApplication
public class FileProcessor 
  implements CommandLineRunner {

    private static Logger log = LoggerFactory.getLogger(FileProcessor.class);
    public static MongoClient mongoClient = new MongoClient("localhost", 27017);

    public static void main(String[] args) {
    	log.info("STARTING THE APPLICATION");
        SpringApplication.run(FileProcessor.class, args);
        log.info("APPLICATION FINISHED");
    }
 
    @Override
    public void run(String... args) {
    	log.info("EXECUTING : command line runner");
    	
    	try {
			ObjectMapper om = new ObjectMapper();
			GraphSidecar root = om.readValue(new File("C:\\_workspace\\amberance\\amberance\\test-json.json"), GraphSidecar.class);
			System.out.println(root);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	
    	
 
        for (int i = 0; i < args.length; ++i) {
        	log.info("args[{}]: {}", i, args[i]);
        }
    }
}
