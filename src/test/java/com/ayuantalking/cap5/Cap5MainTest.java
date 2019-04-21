package com.ayuantalking.cap5;

import com.ayuantalking.cap1.entity.Person;
import com.ayuantalking.cap4.config.Cap4MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap5MainTest {

    @Test
    public void test(){
        ApplicationContext app = new AnnotationConfigApplicationContext(Cap5MainConfig.class);
        // 1.打印IOC容器中person实例的对象
        String[] beanNamesForType = app.getBeanNamesForType(Person.class);
        for (String beanName : beanNamesForType){
            System.out.println(beanName);
        }
    }
}
