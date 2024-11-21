package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public List<String> name() {
        List<String> res = new ArrayList<>();
        res.add("hello");
        return res;
    }
}
