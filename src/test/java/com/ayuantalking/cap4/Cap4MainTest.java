package com.ayuantalking.cap4;

import com.ayuantalking.cap4.config.Cap4MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class Cap4MainTest {

    @Test
    public void test(){
        ApplicationContext app = new AnnotationConfigApplicationContext(Cap4MainConfig.class);
        System.out.println("容器初始化完毕");
        app.getBean("person");
    }
}
