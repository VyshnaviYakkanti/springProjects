package com.luv2code.springboot.demo.myspringapp;


// This one we are not using componenet but spring will create as we created bean in config file
public class SwimCoach implements Coach{

    @Override
    public String getDailyWorkOut() {
        return "Swim 1000m as a warm up";
    }
}
