package com.luv2code.springboot.demo.myspringapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling 15 min daily !!!";
    }
}
