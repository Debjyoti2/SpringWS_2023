package com.jdbc.com.pwb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DynamikApplicationContext {
	
	
	public static Object returnObject(String dependencyName) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/jdbc/jdbc-config.xml");
		Object obj = con.getBean(dependencyName);
		return obj;
	}

}
