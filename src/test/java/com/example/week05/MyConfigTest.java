package com.example.week05;

import com.example.week05.homework02.method01.config.BeanConfig;
import com.example.week05.homework02.method01.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyConfigTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        User getUser = (User) context.getBean("userTest");
        System.out.println(getUser.getName());
    }
}
