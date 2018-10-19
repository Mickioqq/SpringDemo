package com.wqq.spring.controller;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("META_INF/beans_cycle.xml");
        Car car=(Car)context.getBean("car");
        System.out.println(car);
        //关闭容器
        context.close();
    }
}
