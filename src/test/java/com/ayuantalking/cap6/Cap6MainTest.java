package com.ayuantalking.cap6;

import com.ayuantalking.cap1.entity.Person;
import com.ayuantalking.cap5.Cap5MainConfig;
import com.ayuantalking.cap6.config.Cap6MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap6MainTest {

    @Test
    public void test(){
        ApplicationContext app = new AnnotationConfigApplicationContext(Cap6MainConfig.class);
        // 1.打印IOC容器中person实例的对象
        String[] beanNamesForType = app.getBeanNamesForType(Person.class);
        for (String beanName : beanNamesForType){
            System.out.println(beanName);
        }
    }
}
