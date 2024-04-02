package com.luv2code.springboot.demo.myspringapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${student.name}")
    private String studentName;

    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/hello")
    public String sayHelloToUser() {
        return "Hello user";
    }

    @GetMapping("/studentInfo")
    public String getStudentInfo() {
        return studentName;
    }

    @GetMapping("/coachInfo")
    public String getCoachInfo() {
        return studentName;
    }
}
