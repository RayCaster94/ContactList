package com.contactlist.spring.model;

import java.util.List;

public class Phone {

	private int phoneId;
	private int phoneNumber;
	private Contact contact;
	
	
	public Phone() {
		
	}

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", phoneNumber=" + phoneNumber + ", contact=" + contact + "]";
	}
	
	
	
	
}
