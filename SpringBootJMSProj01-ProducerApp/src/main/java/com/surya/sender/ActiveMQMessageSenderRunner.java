package com.surya.sender;

import java.util.Date;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQMessageSenderRunner  {
	
	@Autowired
	private JmsTemplate template;

	@Scheduled(cron="*/10  * * * * *")
     public void sendMessage() {
		/*	 
		    // Using Anonymous inner class logics
           template.send("testmq1",new MessageCreator() {
			@Override
			public Message createMessage(Session ses) throws JMSException {
				Message message = ses.createTextMessage("From Sender at :: "+ new Date());
				return null;
			}
		});  */
		
		/*   
		 // Using LAMBDA Style Anonyomous inner class 
		template.send("testmq1", ses-> {
			  return ses.createTextMessage("From sender at"+ new Date());
		});
        */
		
		// improvised the Lambda anonyomous inner class
		template.send("testmq1",ses->ses.createTextMessage("From sender at"+new Date()));
		System.out.println("Message Sent");
	} // run()

}  // class
