package com.ayuantalking.cap1;

import com.ayuantalking.cap1.config.MainConfig;
import com.ayuantalking.cap1.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 演示注解方式配置bean
 * @Configuration
 * @Bean
 */
public class MainTest2 {

    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = app.getBeanNamesForType(Person.class);
        for (String name: beanDefinitionNames ) {
            System.out.println(name);
            Person person = app.getBean(name, Person.class);
            System.out.printf(person.toString());
        }


    }
}
