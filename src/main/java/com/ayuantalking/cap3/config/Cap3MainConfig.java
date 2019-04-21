package com.ayuantalking.cap3.config;

import com.ayuantalking.cap1.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Cap3MainConfig {

    @Scope("prototype")
    @Bean
    public Person person(){
       return new Person("Cap3",18);
    }
}
