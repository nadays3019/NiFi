package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NiFiController {

	
	@GetMapping("/nifi")
	public String test() {
		
		return "aa12"; 
	}
	
}
