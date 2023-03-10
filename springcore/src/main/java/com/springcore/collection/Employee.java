package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private String empName;
	private List<String> phones;
	private Set<String> address;
	private Map<Integer,String> courses;
	
	public Employee() {
	}
	
	
	
	public Employee(String empName, List<String> phones, Set<String> address, Map<Integer, String> courses) {
		super();
		this.empName = empName;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}



	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<Integer, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<Integer, String> courses) {
		this.courses = courses;
	}



	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", phones=" + phones + ", address=" + address + ", courses=" + courses
				+ "]";
	}
	
	

}
