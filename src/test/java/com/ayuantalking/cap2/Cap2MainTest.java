package com.ayuantalking.cap2;

import com.ayuantalking.cap1.entity.Person;
import com.ayuantalking.cap2.config.Cap2MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

/**
 * @ComponentScan 包扫描注解的使用
 *     includeFilters [] 指定扫描的时候按照规则包含组件
 *     excloudfilters [] 指定扫描的时候按照规则过滤组件
 *     useDefaultFilters = false 关闭默认过滤规则，默认是true扫描所有组件
 */
public class Cap2MainTest {

    @Test
    public void test1(){
        ApplicationContext app = new AnnotationConfigApplicationContext(Cap2MainConfig.class);
        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            System.out.println(beanName);
        }
    }
}
