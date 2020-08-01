package com.myorg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeadManagementApplication {

	public static void main(String[] args) {
		System.out.println("In Lead Management Main Class");
		SpringApplication.run(LeadManagementApplication.class, args);
	}

}
