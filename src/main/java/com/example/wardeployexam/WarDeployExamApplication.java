package com.example.wardeployexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.SpringServletContainerInitializer;

@SpringBootApplication
public class WarDeployExamApplication extends SpringBootServletInitializer {


	public static void main(String[] args){
		SpringApplication.run(WarDeployExamApplication.class, args);
	}

}
