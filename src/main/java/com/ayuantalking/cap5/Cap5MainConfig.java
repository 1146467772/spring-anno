package com.ayuantalking.cap5;

import com.ayuantalking.cap1.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Cap5MainConfig {

    @Conditional(value = WindowConditional.class)
    @Bean
    public Person windowPerson(){
        System.out.println("window下person初始化完成");
        return new Person("cap5",19);
    }

    @Conditional(value = LinuxConditional.class)
    @Bean
    public Person linuxPerson(){
        System.out.println("window下person初始化完成");
        return new Person("cap5",19);
    }

}
