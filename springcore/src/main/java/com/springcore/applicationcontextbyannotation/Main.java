package com.springcore.applicationcontextbyannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(MyConfig.class);
		Vehicle vehicle = context.getBean("bus",Vehicle.class);
		vehicle.speed();

	}

}
