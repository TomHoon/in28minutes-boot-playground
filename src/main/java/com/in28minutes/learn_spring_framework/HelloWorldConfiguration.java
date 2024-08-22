package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person("tomhoon", 30, new Address("Main Street", "Utah"));
	}

	@Bean(name = "address")
	public Address address() {
		return new Address("Basic Street", "Busan");
	}
	
	@Bean(name = "address2")
	public Address addressTwo() {
		return new Address("bakerStreet", "Anyang");
	}
	
	@Bean(name = "address3")
	public Address addressThree() {
		return new Address("Gumchen Street", "Seoul");
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}
}
