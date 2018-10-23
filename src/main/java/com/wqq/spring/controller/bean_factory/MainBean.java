package com.wqq.spring.controller.bean_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBean {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("META_INF/beans_factoryBean.xml");
        Car car=(Car)context.getBean("car");
        System.out.println(car);
    }
}
