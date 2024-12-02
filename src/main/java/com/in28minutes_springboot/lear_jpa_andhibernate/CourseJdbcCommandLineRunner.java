package com.in28minutes_springboot.lear_jpa_andhibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes_springboot.lear_jpa_andhibernate.repository.CourseJpaRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

    // @Autowired
    // private CourseJdbcRepository courseJdbcRepository;

    // @Autowired
    // private CourseJpaRepository courseJpaRepository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Course course = new Course(3, "hello3", "new Course!");
        Course course2 = new Course(5, "hello5", "new Course!");

        repository.save(course);
        repository.save(course2);

        List<Course> list = repository.findByAuthor(course.getAuthor());
        System.out.println(list.get(0).getName());
        
        List<Course> list2 = repository.findByName(course2.getName());
        System.out.println(list2.get(0).getName());

    }
    
}
