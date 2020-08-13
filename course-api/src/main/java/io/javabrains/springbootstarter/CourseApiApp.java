package io.javabrains.springbootstarter;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {
	
	
	private static final Logger log = LoggerFactory.getLogger(CourseApiApp.class);
	 

	public static void main(String[] args) {
		
		
    SpringApplication.run(CourseApiApp.class, args);
    }
}