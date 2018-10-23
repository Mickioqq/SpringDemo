package com.wqq.spring.controller.bean_properties;

import com.wqq.spring.controller.Autowired.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("META_INF/beans_properties.xml");
        Car car=(Car)context.getBean("car");
        System.out.println(car);
    }
}
