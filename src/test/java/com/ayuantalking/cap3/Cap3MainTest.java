package com.ayuantalking.cap3;

import com.ayuantalking.cap1.entity.Person;
import com.ayuantalking.cap2.config.Cap2MainConfig;
import com.ayuantalking.cap3.config.Cap3MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Scope
 * prototype: 多实例：IOC容器启动并不会去调用方法创建对象放在容器中，而是
 *  每次获取的时候才会调用方法创建对象
 * singleton: 单实例（默认）：IOC容器启动会调用方法创建对象放到IOC容器中
 *  以后每交获取就是直接从容器（理解成从map.get对象）中拿
 * request:  主要针对WEB应用，同一次请求创建一个实例
 * session:  同一个session创建一个实例（后面两个用得不多，了解即可）
 */
public class Cap3MainTest {

    @Test
    public void test(){
        ApplicationContext app = new AnnotationConfigApplicationContext(Cap3MainConfig.class);
        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            System.out.println(beanName);
        }

        Person person1 = app.getBean("person", Person.class);
        Person person2 = app.getBean("person", Person.class);
        System.out.println(person1==person2);
    }
}
