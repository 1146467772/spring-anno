package com.ayuantalking.cap6.config;

import com.ayuantalking.cap6.entity.Dog;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Dog.class)
public class Cap6MainConfig {
}
