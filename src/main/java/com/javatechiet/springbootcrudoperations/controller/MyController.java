package com.javatechiet.springbootcrudoperations.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @GetMapping("/about")
    public  String getAbout(){
        String str = "Subscribe here";
        str = str.toLowerCase();
        str=str.toUpperCase();
        return str;
    }


}
