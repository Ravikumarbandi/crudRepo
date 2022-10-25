package com.javatechiet.springbootcrudoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("raju","cse");
        Student s2 = new Student("akhil","mech");
        Student s3 = new Student("jashuva","automobile");
        Student s4 = new Student("sivaji","civil");
        Student s5 = new Student("rohit","comp");
        String s6 = "rahul";
        List<Student>  studentList=new ArrayList<>();
        addStudent(studentList,s1);
        addStudent(studentList,s2);
        addStudent(studentList,s3);
        addStudent(studentList,s4);
        addStudent(studentList,s5);

        System.out.println(studentList);


        int [] arr = new int[10];

        Random r = new Random();
        for (int i= 0;i<10; i++) {
            arr[i] = r.nextInt(20);
        }
            System.out.println("Before Sorting");
            Arrays.stream(arr).forEach(System.out::println);
            new MergeSort().mergeSort(arr);

            System.out.println("After Sorting");
            Arrays.stream(arr).forEach(System.out::println);


    }

    public static void addStudent(List<Student> studentList, Student student) {
        studentList.add(student);
    }
}
