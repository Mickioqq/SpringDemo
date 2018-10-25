package com.wqq.spring.controller.proxy;

/**
 * 代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理
 */
public class MainDynamicProxy {
    public static void main(String[] args) {
        //目标对象
        IUserDao target=new UserDao();
        //原始类型
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.save();

    }
}
