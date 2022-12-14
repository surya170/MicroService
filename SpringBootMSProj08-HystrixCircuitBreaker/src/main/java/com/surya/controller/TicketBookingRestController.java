package com.surya.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping("/ticket")
public class TicketBookingRestController {
	int count = 0;

	@GetMapping("/book")
	@HystrixCommand(fallbackMethod = "dummyBookTicket")
	public String bookTicket() {
		System.out.println("TicketBookingRestController.bookTicket()");
		int x = new Random().nextInt(10);

		if (x < 5) {
			throw new RuntimeException("Problem in b.logic");
		}
		return "output from b.logic";
	}

	public String dummyBookTicket() {
		System.out.println("TicketBookingRestController.dummyBookTicket()");
		return "Please Try Later - Inconvience is regratted";
	}

}
