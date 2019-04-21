package com.ayuantalking.cap1;

import com.ayuantalking.cap1.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 演示 beans.xml方式初始化bean  构造注入，setter注入
 *
 */
public class MainTest1 {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        Person person = app.getBean("person", Person.class);
        System.out.printf(person.toString());
    }
}
