package com.wqq.spring.controller.spring_aop.before;

import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDao {
    public void save(String name){
        System.out.println("save......"+name);
    }
}
