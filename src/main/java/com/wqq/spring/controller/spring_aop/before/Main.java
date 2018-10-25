package com.wqq.spring.controller.spring_aop.before;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *在AspectJ注解中，切面是一个带有@Aspect注解的java类
 * 通知是标注有某种注解的简单的java方法
 * AspectJ支持五种类型的注解
 * @Before：前置通知,在方法执行之前通知
 * @After:后置通知，在方法执行之后通知
 * @AfterRunning:返回通知,在方法返回结果之后执行
 * @AfterThrowing:异常通知,在方法抛出异常之后
 * @Around:环绕通知,围绕着方法执行
 *
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("META_INF/beans_aop.xml");
        UserDao userDao=(UserDao)context.getBean("userDao");
        userDao.save("qq");
    }
}
