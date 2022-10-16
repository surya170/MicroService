package com.surya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootMsProj02ShoppingServiceProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj02ShoppingServiceProducerApplication.class, args);
	}

}
