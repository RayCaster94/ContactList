package com.contactlist.spring.model;

import java.util.List;

public class Contact {

	private int contactId;
	private String contactName;
	private String contactSurname;
	private Address address;
	List<Phone> phoneList;
	private City city;
	
	public Contact() {
		
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactSurname() {
		return contactSurname;
	}

	public void setContactSurname(String contactSurname) {
		this.contactSurname = contactSurname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Phone> getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(List<Phone> phoneList) {
		this.phoneList = phoneList;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactSurname=" + contactSurname
				+ ", address=" + address + ", phoneList=" + phoneList + ", city=" + city + "]";
	}
	
	
	
}
