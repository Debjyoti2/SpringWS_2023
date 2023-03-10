package com.springcore.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Teacher teacher = (Teacher) context.getBean("teacher");
		System.out.println(teacher);
		

	}

}
