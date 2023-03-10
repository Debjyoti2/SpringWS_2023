package com.springcore.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
	   AbstractApplicationContext context	=new ClassPathXmlApplicationContext("com/springcore/beanlifecycle/config.xml");
	   context.registerShutdownHook();
	   Samosa s = (Samosa) context.getBean("s1");
	   System.out.println(s);
	   
	}
	
}
