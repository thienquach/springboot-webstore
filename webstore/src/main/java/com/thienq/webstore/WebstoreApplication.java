package com.thienq.webstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.context.annotation.Bean;

import com.thienq.webstore.controller.AppErrorController;

@SpringBootApplication
public class WebstoreApplication {
	
	 @Autowired
	 private ErrorAttributes errorAttributes;

	 @Bean
	 public AppErrorController appErrorController(){return new AppErrorController(errorAttributes);}

	public static void main(String[] args) {
		SpringApplication.run(WebstoreApplication.class, args);
	}
}
