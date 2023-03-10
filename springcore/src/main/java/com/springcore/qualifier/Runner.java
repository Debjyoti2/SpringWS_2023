package com.springcore.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
    
		ApplicationContext context2= new ClassPathXmlApplicationContext("com/springcore/qualifier/config.xml");
		Emp emp1 = (Emp) context2.getBean("emp");
		System.out.println("emp1 is :: " + emp1);  

	}

}
