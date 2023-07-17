package com.illuminateskills.spring.devops_automation.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsAutomationDemoApplication {
	
	@GetMapping
	public String message() {
		return "Welcome to Illuminate Skills!!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsAutomationDemoApplication.class, args);
	}

}
