package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {

	  ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
	  Student student =context.getBean("student",Student.class);
	  System.out.println("student :: " + student);
	  

	}

}
