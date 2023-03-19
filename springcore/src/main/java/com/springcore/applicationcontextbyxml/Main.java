package com.springcore.applicationcontextbyxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {


		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/applicationcontextbyxml/config.xml");
		Vehicle vehicle = context.getBean("train",Vehicle.class);
		vehicle.speed();

	}

}
