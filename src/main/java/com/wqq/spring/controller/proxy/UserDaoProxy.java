package com.wqq.spring.controller.proxy;

/**
 * 静态代理
 */
public class UserDaoProxy implements IUserDao {
    private IUserDao target;

    public UserDaoProxy(IUserDao target){
        this.target=target;
    }
    @Override
    public void save() {
        System.out.println("begin save....");
        target.save();
        System.out.println("end save.....");
    }
}
