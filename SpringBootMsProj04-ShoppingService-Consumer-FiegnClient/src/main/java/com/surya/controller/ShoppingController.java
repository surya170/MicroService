package com.surya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surya.client.IBillingServiceRestConsumer;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {
    
	 @Autowired
	 private IBillingServiceRestConsumer consumer;
	 
	 @GetMapping("/info")
	 public String displayShoppingDetails() {
		 System.out.println("ShoppingController: client Comps  class name  ::"+consumer.getClass());
		 return "Pongal Shopping Family Details........"+consumer.fetchBillDetails();
	 }
	
}
