package com.example.darkdevil.activemq.resource;

import java.util.ArrayList;
import java.util.List;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.darkdevil.activemq.models.Contacts;

//@RestController
//@RequestMapping("contacts")
public class ContactController {

//	@Autowired
//	private JmsTemplate jmsTemplate;
//	@Autowired
//	private Queue queue;
//	
//	@GetMapping("test")
//	public String test() {
//		return "test";
//	}
	
//	@PostMapping(value="save/list", consumes = "application/json")
//	public String saveList(@RequestBody List<Contacts> contactList) {
//		jmsTemplate.convertAndSend(queue, contactList);
//		return "Contact saved successfully";
//	}
	
//	@PostMapping(value="save", consumes = "application/json")
//	public String saveList(@RequestBody Contacts contact) {
//		jmsTemplate.convertAndSend(queue, contact);
//		return "Contact saved successfully";
//	}
//	
//	@RequestMapping(value = "/test1", consumes = "application/json", method = RequestMethod.POST)
//	public List<Contacts> insertContact(@RequestBody Contacts contacts) {
//		System.out.println(contacts.toString());
//		
//		Contacts c1 = new Contacts("Hariharan", "0776318136");
//		Contacts c2 = new Contacts("Vasudevan", "0779784296");
//		
//		List<Contacts> cList = new ArrayList<Contacts>();
//		cList.add(c1);
//		cList.add(c2);
//		
//		return cList;
//	}
//	
//	@RequestMapping(value = "/test2", consumes = "application/json", method = RequestMethod.POST)
//	public boolean insertContact(@RequestBody List<Contacts> contactsList) {
//		System.out.println(contactsList.toString());
//		return true;
//	}
	
}
