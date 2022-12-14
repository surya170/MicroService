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
	@HystrixCommand(fallbackMethod = "dummyBookTicket", commandProperties = {
			 @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
	          @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
			  @HystrixProperty(name = "circuitBreaker.enabled",value="true")
	})
	public String bookTicket() {
		System.out.println("TicketBookingRestController.bookTicket()");
		if (new Random().nextInt(10) < 5) {
			throw new RuntimeException("Problem in b.logic");
		}
		
		System.out.println("End Of Ticket Booking Operation");
		return "output from b.logic";
	}

	public String dummyBookTicket() {
		count++;
		System.out.println("TicketBookingRestController.dummyBookTicket()::"+count);
		return "Please Try Later - Inconvience is regratted";
	}

}
