package com.example.darkdevil.activemq.listner;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@JmsListener(destination = "inmemory.queue")
	public void listner(String message) {
		System.out.println("Received message: " + message);
	}
	
}
