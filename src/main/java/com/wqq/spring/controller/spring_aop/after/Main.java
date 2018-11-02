package com.wqq.spring.controller.spring_aop.after;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("META_INF/beans_aop_after.xml");
        ArithmetiCalculator arithmetiCalculator=(ArithmetiCalculator)context.getBean("arithmetiCalculator");

        System.out.println(arithmetiCalculator.getClass().getName());

        int result=arithmetiCalculator.Add(1,2);
        System.out.println(result);

        result=arithmetiCalculator.Sub(10,2);
        System.out.println(result);
    }
}
