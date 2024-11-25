package com.in28minutes.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Course: id, name, Author
@RestController
public class CourseController {

    @Autowired
    private CurrencyServiceConfiguration config;

    @RequestMapping("/test")
    public CurrencyServiceConfiguration retrieveAllCourses() {
        return config;
    }
    
}
