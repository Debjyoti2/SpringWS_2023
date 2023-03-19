package com.springcore.applicationcontextbyannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	@Bean
	public Bus bus() {
		return new Bus();
	}
	
	@Bean
	public Train train() {
		return new Train();
	}

}
