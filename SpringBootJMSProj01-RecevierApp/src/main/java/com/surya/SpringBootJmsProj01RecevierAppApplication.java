package com.surya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms // optional

public class SpringBootJmsProj01RecevierAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJmsProj01RecevierAppApplication.class, args);
	}

}
