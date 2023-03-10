package com.springcore.dependencyInjectionByConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	
	
	public static void main(String[] args) {
		
		ApplicationContext context =  new  ClassPathXmlApplicationContext("com/springcore/dependencyInjectionByConstructor/config-ci.xml");
		Person p = (Person) context.getBean("person1");
		System.out.println(p);
		
	}

}
