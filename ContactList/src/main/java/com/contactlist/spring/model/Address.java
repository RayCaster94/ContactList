package com.contactlist.spring.model;

public class Address {

	private int addressId;
	private String addressName;
	private Contact contact;
	
	public Address() {
		
	}


	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}


	@Override
	public String toString() {
		return "address [addressId=" + addressId + ", addressName=" + addressName + ", contact=" + contact + "]";
	}
	
	
}
