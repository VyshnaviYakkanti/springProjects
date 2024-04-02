package com.luv2code.springboot.demo.myspringapp;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//Use scope annotation to change the creation of instances
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "Practice baseball for 30 min !!";
    }
}
