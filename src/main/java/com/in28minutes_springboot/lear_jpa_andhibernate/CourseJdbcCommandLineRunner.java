package com.in28minutes_springboot.lear_jpa_andhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        Course course = new Course(3, "hello", "new Course!");
        Course course2 = new Course(5, "hello", "new Course!");
        courseJdbcRepository.insert(course);
        courseJdbcRepository.insert(course2);
        courseJdbcRepository.deleteById(3);

        Course result = courseJdbcRepository.selectById(5);
        System.out.println("result > " + result);
        System.out.println("getId > " + result.getId());
        System.out.println("getAuthor > " + result.getAuthor());
    }
    
}
