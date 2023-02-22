package com.ahmi.magehand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "com.ahmi.magehand.controllers", "com.ahmi.magehand.exceptions",
		"com.ahmi.magehand.models", "com.ahmi.magehand.repositories", "com.ahmi.magehand.services" })
@SpringBootApplication
public class FaourAhmadMageHandCaseStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaourAhmadMageHandCaseStudyApplication.class, args);
	}

}
