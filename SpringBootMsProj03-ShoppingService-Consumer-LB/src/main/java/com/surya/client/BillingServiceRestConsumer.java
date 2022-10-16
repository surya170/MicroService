package com.surya.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceRestConsumer {
	
	@Autowired
	private LoadBalancerClient client;  // comes through AutoConfiguration
	
	public String getBillinginfo() {
		// get Less Load Factory  Service Instance 
		ServiceInstance SI = client.choose("Billing-Service");
		// get produce  MS URI and make it URL 
		String url = SI.getUri()+"/billing/info";
		//Create  RestTemplate object
		RestTemplate template = new RestTemplate();
		// invoke producer MS Service  method  or operation by generating HTTP call
		String resp = template.getForObject(url,String.class);
		return resp;
	}
	

}
