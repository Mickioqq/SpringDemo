package com.wqq.spring.controller.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("META_INF/beans_autowire.xml");

        Human human=(Human)context.getBean("human1");
        System.out.println(human);
    }
}
