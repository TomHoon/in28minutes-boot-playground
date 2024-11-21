package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// without getter,setter. since jdk16, they provide it
record Person (String name, int age) {};

record Person3 (Address adress, Person person) {}

record Address (String addr, String street) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "tomhoon";
    }

    @Bean
    public int age() {
        return 10;
    }    

    @Bean
    public Person person() {
        var person = new Person("Tomhoon", 30);
        return person;
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("강서구", "방화로");
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age());
    }

    @Bean
    public Person3 person3MethodCall(Address address, Person person2MethodCall) {
        return new Person3(address, person2MethodCall);
    }
}
