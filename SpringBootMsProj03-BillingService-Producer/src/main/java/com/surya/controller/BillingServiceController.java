package com.surya.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingServiceController {

	@Value("${server.port}")
	private int port;
	@Value("${eureka.instance.instance-id}")
	private String instanceId;

	@GetMapping("info")
	public String getBillinginfo() {
		return "We Are Accepting Card Payments,UPI Payments,NetBanking Payments,COD ----> port :: " + port
				+ "---- instanceid" + instanceId;
	}

}
