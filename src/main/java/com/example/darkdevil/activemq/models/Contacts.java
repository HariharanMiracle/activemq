package com.example.darkdevil.activemq.models;

import java.io.Serializable;

public class Contacts implements Serializable {
	
	private static final long serialVersionUID = -295422703255886286L;

	private String name;
	private String contact;
	
	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Contacts(String name, String contact) {
		super();
		this.name = name;
		this.contact = contact;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", contact=" + contact + "]";
	}
	
}
