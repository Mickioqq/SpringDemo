package com.wqq.spring.controller.proxy.Cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib代理
 * Cglib代理,也叫作子类代理,它是在内存中构建一个子类对象从而实现对目标对象功能的扩展.
 * JDK的动态代理有一个限制,就是使用动态代理的对象必须实现一个或多个接口,如果想代理没有实现接口的类,就可以使用Cglib实现.
 */
public class ProxyFactory implements MethodInterceptor {
    private  Object target;
    public ProxyFactory(Object target){
        this.target=target;
    }
    //给目标创建一个代理对象
    public Object getProxyInstance(){
        //工具类
        Enhancer enhancer=new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类（代理对象）
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib begin......");
        Object returnValue=method.invoke(target,objects);
        System.out.println("Cglib end......");
        return returnValue;
    }
}
