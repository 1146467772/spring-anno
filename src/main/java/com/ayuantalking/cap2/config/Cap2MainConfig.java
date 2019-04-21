package com.ayuantalking.cap2.config;

import com.ayuantalking.cap1.entity.Person;
import com.ayuantalking.cap2.controller.OrderController;
import com.ayuantalking.cap2.service.OrderService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Configurable
@ComponentScan(value = "com.ayuantalking.cap2"
        //type = FilterType,ANNOTATION 拦截类型为注解 ,classes 可以为 Controller ,Service 等spring注解 includeFilters = { @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class) 设置过滤规则，根据注解类型排除扫描 ，这里表示扫描com.ayuantalking.cap2 包下用了@Controller注解的bean，除了声明了@controller注解的其他的不扫描
        //FilterType.ASSIGNABLE_TYPE // 指定类型 比如某个类  like  this
,  includeFilters = {
        //@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class),
        //@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = OrderService.class),
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = Cap2Filter.class)
}
        // 不适用本地过滤规则 ，默认情况是开启的
,excludeFilters = {
   @ComponentScan.Filter
},useDefaultFilters = false)
public class Cap2MainConfig {

    @Bean
    public Person person01(){
        return new Person("jack", 12);
    }
}
