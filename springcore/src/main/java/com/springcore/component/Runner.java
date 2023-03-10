package com.springcore.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {

	  ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/component/config.xml");
	  Student student =context.getBean("student",Student.class);
	  System.out.println("student :: " + student);
	  

	}

}
