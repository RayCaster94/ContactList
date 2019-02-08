package com.contactlist.spring.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "telefono")
public class Phone {

	private int phoneId;
	private int phoneNumber;
	private Contact contactId;
	
	
	public Phone() {
		
	}

    @Id
    @GeneratedValue
    @Column(name = "idtelefono")
	public int getPhoneId() {
		return phoneId;
	}


	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

    @Column(name = "telefono")
	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

    @Column(name = "idpersona")
	public Contact getcontactId() {
		return contactId;
	}


	public void setIdContact(Contact contactId) {
		this.contactId= contactId;
	}


	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", phoneNumber=" + phoneNumber + ", idContact=" + contactId + "]";
	}

	
	
}
