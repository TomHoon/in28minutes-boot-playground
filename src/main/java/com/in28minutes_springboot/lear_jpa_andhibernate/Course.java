package com.in28minutes_springboot.lear_jpa_andhibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    public Course() {

    }

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }
}
