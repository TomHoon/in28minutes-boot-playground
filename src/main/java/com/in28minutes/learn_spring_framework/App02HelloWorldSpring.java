package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	public static void main(String[] args) {
		// 1: Launch a Spring Context
		
		var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguartion.class);
		
		// 2: Configure the things that we want Spring to manage;
	}
}

