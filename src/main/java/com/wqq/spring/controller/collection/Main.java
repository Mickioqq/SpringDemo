package com.wqq.spring.controller.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("META_INF/collectionContext.xml");
        Person person=(Person)context.getBean("person");
        System.out.println(person);
        NewPerson newPerson=(NewPerson)context.getBean("newPerson");
        System.out.println(newPerson);

        DataSource dataSource=context.getBean(DataSource.class);
        System.out.println(dataSource.getProperties());
        Person person1=(Person)context.getBean("person1");
        System.out.println(person1);

        Person person2=(Person)context.getBean("person2");
        System.out.println(person2);

    }
}
