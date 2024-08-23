package com.in28minutes.learn_spring_framework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		String name = (String)context.getBean("name");
		
		System.out.println(name);
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address2"));
		
		System.out.println(context.getBean(Address.class));
		
//		System.out.println(context.getBean("person2MethodCall"));
//		
		System.out.println("priamry test : " + context.getBean("person3Parameters"));
		
		
//		Arrays.stream(context.getBeanDefinitionNames())
//			.forEach(System.out::println);
		
		System.out.println("person4Parameters:: " + context.getBean("person4Parameters"));
	}
}
