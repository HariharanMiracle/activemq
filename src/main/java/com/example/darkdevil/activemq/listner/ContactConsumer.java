package com.example.darkdevil.activemq.listner;

import java.util.List;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.example.darkdevil.activemq.models.Contacts;

@Component
public class ContactConsumer {

//	@JmsListener(destination = "inmemory.queue")
//	public void listner(List<Contacts> contactList) {
//		System.out.println("Contact-details");
//		System.out.println(contactList.toString());
//	}
	
	
	
	
//	@JmsListener(destination = "inmemory.queue")
//	public void listner(Message message){
//		try {
//			ObjectMessage mapMessage = (ObjectMessage) message;
//	        Contacts contact = (Contacts) mapMessage.getObject();
//	        System.out.println(contact.toString());
//		} catch (NumberFormatException | JMSException e) {
//			e.printStackTrace();
//		}
//	}
	
}
