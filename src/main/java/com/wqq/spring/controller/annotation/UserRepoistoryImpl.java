package com.wqq.spring.controller.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userRepoistoryImpl")
public class UserRepoistoryImpl implements UserRepoistory {
    /**
     *1：构造器 ,普通字段（即使是非public）,一切具有参数的方法都可以应用@AutoWired
     * 2：默认情况下，所有使用@AutoWired属性都应该被设置,当Spring找不到匹配的Bean装配属性时，会报异常
     * 若某一属性允许不被设置，可以设置@AutoWired注解的required为false
     * 3：当IOC容器中存在多个类型兼容的Bean时，通过类型的自动装配无法工作,此时可以在@Qualifiter里提供Bean
     * 的名称
     */
    @Autowired(required =false)
    private TestObject testObject;
    @Override
    public void save() {
        System.out.println("UserRepoistoryImpl....");
        System.out.println(testObject);
    }
}
