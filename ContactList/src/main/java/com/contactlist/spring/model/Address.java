package com.contactlist.spring.model;

public class Address {

	private int addressId;
	private String addressName;
	private int postalCode;
	private String town;
	
	private City idCity;  //idprovincia
	private Contact idContact; //idpersona 
	
	//GETTERS AND SETTERS
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddressName() {
		return addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public City getIdCity() {
		return idCity;
	}
	public void setIdCity(City idCity) {
		this.idCity = idCity;
	}
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
