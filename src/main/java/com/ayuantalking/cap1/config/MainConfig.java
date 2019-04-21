package com.ayuantalking.cap1.config;

import com.ayuantalking.cap1.entity.Person;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class MainConfig {

    @Bean(value = "person1") // 默认为方法名person2
    public Person person2(){
        return new Person("wang5", 19);
    }

}
