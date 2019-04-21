package com.ayuantalking.cap4.config;

import com.ayuantalking.cap1.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class Cap4MainConfig {

    @Lazy
    //@Scope("prototype")
    @Bean
    public Person person(){
        System.out.println("初始化person");
        return new Person("cap4",19);
    }

}
