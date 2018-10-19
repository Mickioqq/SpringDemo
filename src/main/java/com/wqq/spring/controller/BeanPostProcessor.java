package com.wqq.spring.controller;


import org.springframework.beans.BeansException;
public class BeanPostProcessor implements org.springframework.beans.factory.config.BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization" + bean + beanName);
        //这里处理所有bean,过滤
        if ("car".equalsIgnoreCase(beanName)){
            //......
        }
        return  bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization" + bean + beanName);
        Car car=new Car();
        car.setBrand("ford");
        return car;
    }
}
