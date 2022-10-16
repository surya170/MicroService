package com.surya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surya.client.BillingServiceRestConsumer;

@RestController
@RequestMapping("/shopping")
public class ShoppingServiceController {
   
	@Autowired
	private BillingServiceRestConsumer consumer;
	
	@GetMapping("/info")
	public String displayShoppingDetails() {
		 return "Dussera Shopping For Family........"+consumer.getBillinginfo();
	}
	
}
