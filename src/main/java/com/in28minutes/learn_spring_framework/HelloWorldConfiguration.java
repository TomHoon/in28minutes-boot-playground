package com.in28minutes.learn_spring_framework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
	@Primary
	public Address address() {
		return new Address("Primary >> Basic Street", "Busan");
	}
	
	@Bean(name = "address2")
	public Address addressTwo() {
		return new Address("bakerStreet", "Anyang");
	}
	
	@Bean(name = "address3")
	@Qualifier("myAddress")
	public Address addressThree() {
		return new Address("MyAddress >>> Gumchen Street", "Seoul");
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	@Primary
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}
	
	@Bean
	public Person person4Parameters(String name, int age, @Qualifier("myAddress") Address address3) {
		return new Person(name, age, address3);
	}
}
