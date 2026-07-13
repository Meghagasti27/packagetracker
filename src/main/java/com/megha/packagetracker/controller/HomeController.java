package com.megha.packagetracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//This class handles HTTP requests.
public class HomeController{
	@GetMapping("/")//When someone visits: http://localhost:8081/ --->run this method.
	public String home() {
		return "Package Tracker Api Running";
	}
}