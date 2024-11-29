package com.in28minutes_springboot.lear_jpa_andhibernate;

public class Course {
    private long id;
    private String name;
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
