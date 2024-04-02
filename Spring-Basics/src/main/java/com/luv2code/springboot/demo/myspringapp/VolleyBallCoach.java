package com.luv2code.springboot.demo.myspringapp;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class VolleyBallCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "Do  VolleyBall Practice";
    }

    @PostConstruct
    void doStartupStuff() {
        System.out.println("Doing startup stuff");
    }

    @PreDestroy
    void doCleanup() {
        System.out.println("Doing cleanup stuff");
    }
}
