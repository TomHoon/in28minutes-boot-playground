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

=======
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		String name = (String)context.getBean("name");
		
		System.out.println(name);
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address2"));
		
//		System.out.println(context.getBean(Address.class));
		
		System.out.println(context.getBean("person2MethodCall"));
		
		System.out.println(context.getBean("person3Parameters"));
	}
}
>>>>>>> main
