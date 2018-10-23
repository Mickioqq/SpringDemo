package com.wqq.spring.controller.spring_SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //SpEL语言(spring表达式语言)，是一个支持运行时查询和操作对象图的强大的表达式语言
          //语法类似EL,SpEL使用#{....}作为定界符,所有在大括号中的字符都被认为是SpEL
        //SpEL 为bean的属性进行动态赋值提供了便利
        //通过SpEL可以实现
        //通过bean的id对bean进行引用
        //调用方法以及引用对象的引用
        //计算表达式的值
        //正则表达式的匹配

        ApplicationContext context=new ClassPathXmlApplicationContext("META_INF/beans_spel.xml");

        Person person=(Person)context.getBean("person");
        System.out.println(person);
    }
}
