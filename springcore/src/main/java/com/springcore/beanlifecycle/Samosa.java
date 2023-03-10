package com.springcore.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Samosa {

	private int price;
	
	public Samosa() {
	}

	public Samosa(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("This is init method called after initialization is done");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("This is destroy method called before bean destroy");
	}
	
}
