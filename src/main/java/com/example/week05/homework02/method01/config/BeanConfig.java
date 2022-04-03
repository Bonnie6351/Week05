package com.example.week05.homework02.method01.config;

import com.example.week05.homework02.method01.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//  JavaConfig装配
@Configuration
@ComponentScan("com.example.week05.pojo")
public class BeanConfig {

    @Bean
    public User userTest() {
        return new User();
    }
}
