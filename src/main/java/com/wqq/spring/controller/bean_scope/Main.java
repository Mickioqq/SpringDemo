package com.wqq.spring.controller.bean_scope;

import com.wqq.spring.controller.Autowired.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("META_INF/beans_scope.xml");
        Car car=(Car)context.getBean("car");
        Car car1=(Car)context.getBean("car");
        System.out.println(car==car1);
    }
}
