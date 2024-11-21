package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// without getter,setter. since jdk16, they provide it
record Person (String name, int age) {};

record Address (String addr, String street) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public List<String> name() {
        List<String> res = new ArrayList<>();
        res.add("hello");
        return res;
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

    @Bean
    public Address address() {
        return new Address("강서구", "방화로");
    }
}
