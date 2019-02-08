package com.contactlist.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "persona")
public class Contact {

	private int contactId;
	private String contactName;
	private String contactSurname;
	private String contactLastSurname;
	private String dni;
	private Date birthDate;
	
	
	public Contact() {
		
	}

	@Id
	@GeneratedValue
	@Column(name = "idpersona")
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	
	@Column(name = "nombre")
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	@Column(name = "apellido1")
	public String getContactSurname() {
		return contactSurname;
	}
	public void setContactSurname(String contactSurname) {
		this.contactSurname = contactSurname;
	}
	
	@Column(name = "apellido2")
	public String getContactLastSurname() {
		return contactLastSurname;
	}
	public void setContactLastSurname(String contactLastSurname) {
		this.contactLastSurname = contactLastSurname;
	}
	
	@Column(name = "dni")
	public String getdni() {
		return dni;
	}
	public void setDNI(String dni) {
		this.dni = dni;
	}
	
	@Column(name = "fechanacimiento")
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
