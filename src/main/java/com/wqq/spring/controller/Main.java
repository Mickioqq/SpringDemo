package com.wqq.spring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
            //HelloWorld hw=new HelloWorld();
            //hw.setName("奇奇");
            //hw.SayHello();
        //创建IOC容器对象
        //ClassPathXmlApplicationContext:ApplicationContext实现类
        ApplicationContext context= new ClassPathXmlApplicationContext("META_INF/applicationContext.xml");
        //根据id获取Bean
        //HelloWorld hw =(HelloWorld)context.getBean("helloWorld");
        //利用类型返回IOC容器中的Bean，但要求IOC容器中必须中能有一个该类型中的Bean;
        //HelloWorld helloWorld=context.getBean(HelloWorld.Class);
        //hw.SayHello();

        //依赖注入三种方式
        //1:属性注入
        //2:构造器注入;
        //3:工厂方法注入
       NewCar newCar=(NewCar)context.getBean("newCar");
        System.out.println(newCar);
        NewCar newCar1=(NewCar)context.getBean("newCar1");
        System.out.println(newCar1);

    }
}
