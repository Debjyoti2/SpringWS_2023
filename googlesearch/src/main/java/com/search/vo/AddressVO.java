package com.search.vo;

public class AddressVO {
	
	@Override
	public String toString() {
		return "AddressVO [city=" + city + ", street=" + street + "]";
	}
	private String city;
	private String street;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	
	

}
