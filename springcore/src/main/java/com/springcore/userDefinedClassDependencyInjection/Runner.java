package com.springcore.userDefinedClassDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {

	ApplicationContext context	=new ClassPathXmlApplicationContext("com/springcore/userDefinedClassDependencyInjection/userDefined-config.xml");
	A a = (A) context.getBean("refA");
	System.out.println(a.getX());
	System.out.println(a.getObj());

	}

}
