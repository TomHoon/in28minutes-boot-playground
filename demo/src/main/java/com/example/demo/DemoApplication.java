package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {

		var context = 
			new AnnotationConfigApplicationContext(
				HelloWorldConfiguration.class
			);

		var address = context.getBean("address");

		System.out.println(address);

	}

}
