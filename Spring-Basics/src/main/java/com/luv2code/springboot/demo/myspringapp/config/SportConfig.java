package com.luv2code.springboot.demo.myspringapp.config;

        import com.luv2code.springboot.demo.myspringapp.Coach;
        import com.luv2code.springboot.demo.myspringapp.SwimCoach;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;

//This one is to tell how to create bean to spring container
@Configuration
public class SportConfig {

    // @Bean is used to create beans 3rd party class and bean id will be name of the method
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }

}
