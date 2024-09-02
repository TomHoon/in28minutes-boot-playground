package com.in28minutes.learn_spring_framework_sec04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
	
}

@Component
@Lazy
class ClassB {
	private ClassA classA;
	
	public ClassB(ClassA a) {
		System.out.println("this is inside of Class B before creating Bean");
		this.classA = a;
	}
	
	public void test() {
		System.out.println("test it's for test in classB");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationLaunchApplication {
	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(LazyInitializationLaunchApplication.class);		
		System.out.println("Initializing Finish");
		context.getBean(ClassB.class).test();
		
	}
}






