package com.wqq.spring.controller.bean_relation;


import com.wqq.spring.controller.Autowired.City;
import com.wqq.spring.controller.Autowired.Human;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("META_INF/beans_relation.xml");

//        City city=(City) context.getBean("city");
//        System.out.println(city);
        City city1=(City) context.getBean("city1");
        System.out.println(city1);

        Human human=(Human) context.getBean("human");
        System.out.println(human);
    }

}
