package com.wqq.spring.controller.bean_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 配置Bean三种方式
 * 1:通过全类名（反射）
 * 2：通过工厂方法（静态工厂方法和实例工厂方法）
 * FactoryBean
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("META_INF/beans_factory.xml");
        Car car=(Car)context.getBean("car");
        System.out.println(car);

        Car car1=(Car)context.getBean("car1");
        System.out.println(car1);
    }


}
