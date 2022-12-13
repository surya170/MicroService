package com.surya.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cust")
public class CustomerOperationController {

	@GetMapping("/display")
	public String displayData() {
		return "Customer info will be displayed here ... Welcome call Center";
	}
 
}
