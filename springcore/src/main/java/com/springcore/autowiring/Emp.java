package com.springcore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
    
	@Autowired
    private Address adddress;

	public Address getAdddress() {
		return adddress;
	}
	
	public void setAdddress(Address adddress) {
		this.adddress = adddress;
	}
	
	@Override
	public String toString() {
		return "Emp [adddress=" + adddress + "]";
	}
  
  
	
}
