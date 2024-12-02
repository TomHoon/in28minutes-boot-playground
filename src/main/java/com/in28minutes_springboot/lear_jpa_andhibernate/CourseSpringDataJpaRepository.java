package com.in28minutes_springboot.lear_jpa_andhibernate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
    List<Course> findByAuthor(String author);
    
    List<Course> findByName(String name);
}
