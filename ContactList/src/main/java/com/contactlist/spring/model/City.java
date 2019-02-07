package com.contactlist.spring.model;

import java.util.List;

public class City {

	private int cityId;
	private String cityName;
	List<Contact> contactList;
	
	
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public List<Contact> getContactList() {
		return contactList;
	}
	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}
	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + ", contactList=" + contactList + "]";
	}
	
		
	
}
