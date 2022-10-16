package com.surya.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingServiceController {
      
	@RequestMapping("/info")
	public String getBillinginfo() { 
		 return "We Accept Card Payment,UPI Payment,Net Banking Payment, COD";
	}
}
