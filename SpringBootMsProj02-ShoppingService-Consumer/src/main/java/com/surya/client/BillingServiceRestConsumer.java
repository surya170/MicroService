package com.surya.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceRestConsumer {
	
	@Autowired 
	private DiscoveryClient client;  // Comes through AutoConfiguration
	
	public String getBillinginfo() {
		// find and get ServiceInstnces of Producer  by using  Service Id.
		List<ServiceInstance> listSI = client.getInstances("Billing-Service");
		// use first Service Instance from the List of Instances 
		ServiceInstance SI = listSI.get(0);
		// get Producer MS URI and make it as URL 
		String URL = SI.getUri()+"/billing/info";
		//Create RestTemplate object
		RestTemplate template = new RestTemplate();
		// invoke producer MS Service method or operation by generating Http Call
		String resp = template.getForObject(URL,String.class);
		// return response
		return resp;
		
	}// method

} // class
