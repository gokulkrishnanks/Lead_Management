package com.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeadManagementApplication {

	public static void main(String[] args) {
		System.out.println("In Lead Management Main Class change...");
		System.out.println("Branch change...");
		SpringApplication.run(LeadManagementApplication.class, args);
		System.out.println("In Lead Management Main Class End");
		System.out.println("In Lead Management Main Class End2");
	}

}
