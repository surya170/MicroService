package com.surya.Scheduling;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class SampleTask {
    
	@Scheduled(fixedDelay = 10)
	public void tester() {
		System.out.println("SampleTask.tester()"+new Date());
	}
	
}

