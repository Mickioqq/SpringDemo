package com.wqq.spring.controller.proxy.Cglib;

/**
 * 目标对象,不实现接口
 */
public class UserDao {
    public void save(){
        System.out.println("CgLib save.....");
    }
}
