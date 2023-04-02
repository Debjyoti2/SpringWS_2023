package com.search.vo;

import java.util.List;

public class StudentVO {
	
	private String stud_name;
	private String  stud_email;
	private String stud_password;
	private String stud_courses;
	private String stud_dob;
	private String stud_age_range;
	private List<String> stud_degrees;
	private String stud_conditions;
	
	private AddressVO address;
	
	
	public AddressVO getAddress() {
		return address;
	}
	public void setAddress(AddressVO address) {
		this.address = address;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public String getStud_email() {
		return stud_email;
	}
	public void setStud_email(String stud_email) {
		this.stud_email = stud_email;
	}
	public String getStud_password() {
		return stud_password;
	}
	public void setStud_password(String stud_password) {
		this.stud_password = stud_password;
	}
	
	public String getStud_courses() {
		return stud_courses;
	}
	public void setStud_courses(String stud_courses) {
		this.stud_courses = stud_courses;
	}
	public String getStud_dob() {
		return stud_dob;
	}
	public void setStud_dob(String stud_dob) {
		this.stud_dob = stud_dob;
	}
	public String getStud_age_range() {
		return stud_age_range;
	}
	public void setStud_age_range(String stud_age_range) {
		this.stud_age_range = stud_age_range;
	}
	public List<String> getStud_degrees() {
		return stud_degrees;
	}
	public void setStud_degrees(List<String> stud_degrees) {
		this.stud_degrees = stud_degrees;
	}
	public String getStud_conditions() {
		return stud_conditions;
	}
	public void setStud_conditions(String stud_conditions) {
		this.stud_conditions = stud_conditions;
	}
	@Override
	public String toString() {
		return "StudentVO [stud_name=" + stud_name + ", stud_email=" + stud_email + ", stud_password=" + stud_password
				+ ", stud_courses=" + stud_courses + ", stud_dob=" + stud_dob + ", stud_age_range=" + stud_age_range
				+ ", stud_degrees=" + stud_degrees + ", stud_conditions=" + stud_conditions + ", address=" + address
				+ "]";
	}


	
	
	
	
	
	
	
	

}
