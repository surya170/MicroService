package com.surya.reciever;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JmsMessageConsumer {

	@JmsListener(destination = "testmq1")
	
	public void readMessage(String text) {
		System.out.println("Recevied Message :: " + text);
	}

}
