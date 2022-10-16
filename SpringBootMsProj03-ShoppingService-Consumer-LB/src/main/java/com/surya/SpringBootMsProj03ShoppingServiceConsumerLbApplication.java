package com.surya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootMsProj03ShoppingServiceConsumerLbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj03ShoppingServiceConsumerLbApplication.class, args);
	}

}
