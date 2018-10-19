package com.wqq.spring.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("META_INF/applicationContext.xml");
        NewCar.Person person=(NewCar.Person)context.getBean("person2");
        System.out.println(person);
    }
}
