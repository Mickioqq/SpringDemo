package com.wqq.spring.controller.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired

    private  UserService userService;
    public void Excute(){
        System.out.println("Excute......");
        userService.add();
    }
}
