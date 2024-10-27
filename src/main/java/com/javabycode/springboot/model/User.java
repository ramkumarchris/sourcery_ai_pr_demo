package com.javabycode.springboot.model;

public class User {
    private String name;
    private int age;
    private String email;

    // Constructor without Builder pattern
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
