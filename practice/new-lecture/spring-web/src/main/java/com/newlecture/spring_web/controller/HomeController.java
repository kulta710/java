package com.newlecture.spring_web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/test")
    public String test () {
        
        return "Hello Spring Boot";
    }

    @RequestMapping("/test2")
    public String test2 () {

        return "test2";
    }
}