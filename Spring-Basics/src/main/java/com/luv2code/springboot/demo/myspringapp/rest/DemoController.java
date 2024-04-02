package com.luv2code.springboot.demo.myspringapp.rest;

import com.luv2code.springboot.demo.myspringapp.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;
    private Coach anotherCoach;
    private Coach coach1;

    //Constructor Injection
    //Auto wire tells Spring to inject dependency
    /*If you have one constructor auto wired id optional
    @Autowired
    DemoController(Coach coach) {
        this.coach = coach;
    }*/

    //Autowire annotation - Spring will search for dep and set value :-)
  /*  @Autowired
    void setCoach(@Qualifier("baseballCoach") Coach coach) {
        this.coach = coach;
    }*/

    // Instead of qualifier if we make @Primary on required implementation spring will inject that
    @Autowired
    void setCoach(@Qualifier("swimCoach")Coach coach) {
        this.coach = coach;
    }

    @Autowired
    void setCoachbase(@Qualifier("baseballCoach") Coach coach1, @Qualifier("baseballCoach") Coach coach2) {
        this.coach1 = coach1;
        this.anotherCoach = coach2;
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return coach.getDailyWorkOut();
    }


    // It should return false as new obj will be created for each injection as we made scope as ProtoType
    @GetMapping("/checkType")
    public boolean check() {
        return coach1 == anotherCoach;
    }

}
