package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collection.Employee;

public class App {

	public static void main(String[] args) {

		System.out.println( "Hello World!" );  

		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		
		Student student1 =(Student) context.getBean("student1");
		System.out.println("Student1 is :: " + student1);
		
		Student student2 =(Student) context.getBean("student2");
		System.out.println("Student2 is :: " + student2);
		
		ApplicationContext context2= new ClassPathXmlApplicationContext("com/springcore/collection/config-collection.xml");
		Employee emp1 = (Employee) context2.getBean("emp1");
		System.out.println("emp1 is :: " + emp1);
	}

}
