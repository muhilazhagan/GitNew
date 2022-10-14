package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitProjectApplication.class, args);
	}

	//docker build -t mydockerapp . // to build the application to image, . is required at the last to denote
								    //	that the docker file in the current path
	//docker run -itd -p 9091:9091 mydockerapp 
	                                // to run the image
	
}
