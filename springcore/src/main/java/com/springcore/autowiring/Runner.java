package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {

	ApplicationContext context	=new ClassPathXmlApplicationContext("com/springcore/autowiring/config.xml");
    
    Emp emp = (Emp) context.getBean("emp"); 
	System.out.println("Emp ::: " + emp);  

	}

}
