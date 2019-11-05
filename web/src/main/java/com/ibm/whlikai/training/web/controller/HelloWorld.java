package com.ibm.whlikai.training.web.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorld {

@RequestMapping("/hello")
    public String hello() {
        return "hello world kenny";
    }
}
