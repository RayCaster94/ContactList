package com.contactlist.spring.model;

import java.util.Date;


public class Contact {

	private int contactId;
	private String contactName;
	private String contactSurname;
	private String contactLastSurname;
	private String dni;
	private Date birthDate;
	
	
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
	public String getContactLastSurname() {
		return contactLastSurname;
	}
	public void setContactLastSurname(String contactLastSurname) {
		this.contactLastSurname = contactLastSurname;
	}
	public String getdni() {
		return dni;
	}
	public void setDNI(String dni) {
		this.dni = dni;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactSurname=" + contactSurname
				+ ", contactLastSurname=" + contactLastSurname + ", DNI=" + dni + ", birthDate=" + birthDate + "]";
	}


	
	
	
}
