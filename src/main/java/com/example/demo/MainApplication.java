package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class MainApplication {

	private static boolean isActive = false;

	// This is kind of managing which service UP or DOWN - and we also can add database for configuring these flags
	@RequestMapping("/active")
	public boolean active() {
		if(!isActive){
			isActive = true;
			return false;
		}else
			return true;
	}

	@RequestMapping("/reset")
	public void reset() {
		isActive = false;
	}

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
}

