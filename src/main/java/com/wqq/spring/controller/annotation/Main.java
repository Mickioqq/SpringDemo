package com.wqq.spring.controller.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 通过注解配置Bean
 * 组件扫描
 * 特定的组件包括：
 * @Componnet:基本注解,标识了一个受spring管理的组件
 * @Respository 标识持久层组件
 * @Service 标识服务层(业务层)组件
 * 对扫描的组件，Spring有默认的命名策略,使用非限定类名,第一个字母小写，也可以在注解中使用value属性值标识组件的名称
 *
 * 组件装配
 * <context:component-scan></context:component-scan>元素还会自动注册AutowiredAnnotationBeanPostProcessor实例，
 * 该实例可以自动装配具有@Autowired和@Resource,@Inject注解的属性
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("META_INF/beans_annotation.xml");

        UserController controller=(UserController)context.getBean("userController");
        controller.Excute();
        //System.out.println(controller);

      /*  TestObject obj=(TestObject)context.getBean("testObject");
        System.out.println(obj);

        UserRepoistoryImpl repoistory=(UserRepoistoryImpl)context.getBean("userRepoistoryImpl");
        System.out.println(repoistory);

        UserService service=(UserService)context.getBean("userService");
        System.out.println(service);*/

    }
}
