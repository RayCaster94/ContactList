package com.contactlist.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "provincia")
public class City {

	private int cityId;
	private String cityName;
	
	public City() {
		
		
	}
    @Id
    @GeneratedValue
    @Column(name = "idprovincia")
	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
    @Column(name = "provincia")
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName  + "]";
	}
	
	
	
		
	
}
