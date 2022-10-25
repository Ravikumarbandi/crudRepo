package com.javatechiet.springbootcrudoperations;

public class Student {

    private String name;
    private String branch;
    public Student(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
