package com.surya.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchServiceController {
   
	@RequestMapping("/display")
	public String displayMessage() {
		return "Welcome to Flipkart Search Service";
	}
	
}
