package com.contactlist.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "direccion")
public class Address {

	private int addressId;
	private String addressName;
	private int postalCode;
	private String town;
	
	private City idCity;  //idprovincia
	private Contact idContact; //idpersona 
	
	
	//GETTERS AND SETTERS
	
	@Id
	@GeneratedValue
	@Column(name = "iddireccion")
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	
	@Column(name = "direccion")
	public String getAddressName() {
		return addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	
	@Column(name = "codpostal")
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	@Column(name = "localidad")
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	
	@Column(name = "idprovincia")
	public City getIdCity() {
		return idCity;
	}
	public void setIdCity(City idCity) {
		this.idCity = idCity;
	}
	
	@Column(name = "idpersona")
	public Contact getIdContact() {
		return idContact;
	}
	public void setIdContact(Contact idContact) {
		this.idContact = idContact;
	}
	
	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressName=" + addressName + ", postalCode=" + postalCode
				+ ", town=" + town + ", idCity=" + idCity + ", idContact=" + idContact + "]";
	}
	
	
	
	
	
	
	
}
