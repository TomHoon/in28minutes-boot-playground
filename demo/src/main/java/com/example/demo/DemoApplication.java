package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {

		var context = 
			new AnnotationConfigApplicationContext(
				HelloWorldConfiguration.class
			);

		var address = context.getBean(Address.class);

		var person2 = context.getBean("person2MethodCall");
		
		var person3 = context.getBean("person3MethodCall");
		
		System.out.println(person3);
	}

}
