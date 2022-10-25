package com.javatechiet.springbootcrudoperations;

public class DemoP {

    public void m1(){
        System.out.println("no-arg");
    }

    public void m1(int i){
        System.out.println("int-arg");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.m1();t.m1();

    }
}