package com.wqq.spring.controller.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    //如果一个接口有多个实现，通过Qualifier指定装配哪一个
    @Qualifier("userRepoistoryImpl")
    private  UserRepoistoryImpl userRepoistory;
    public void add(){

        System.out.println("UserService....");
        userRepoistory.save();
    }
}
