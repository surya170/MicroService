package com.surya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableEurekaClient
@EnableScheduling
public class SpringBootMsProj05CustomerRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj05CustomerRestServiceApplication.class, args);
	}

}
