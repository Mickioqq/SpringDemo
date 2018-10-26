package com.wqq.spring.controller.spring_aop.before;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//把这个类声明一个切面:需要把类放入到IOC容器中,在声明为一个切面
@Aspect
@Component
class LoggingAspect {
    //声明该方法为一个前置通知:目标方法开始之前执行
    //匹配该类下面所有的方法 *
    //@Before("execution(public void com.wqq.spring.controller.spring_aop.before.UserDao.*(String))")
    //*匹配
    //@Before("execution(* com.wqq.spring.controller.spring_aop.before.*.*(String))")

    @Before("execution(public void com.wqq.spring.controller.spring_aop.before.UserDao.save(String))")
    public void BeforeMethod(JoinPoint joinPoint){
        //目标方法名
        String methodName=joinPoint.getSignature().getName();
        //目标方法参数
        List<Object> arges= Arrays.asList(joinPoint.getArgs());
        System.out.println("The Method " + methodName +  " begins with" + arges);
    }

    /**
     * 后置通知:在目标方法执行后(无论是否发生异常),执行通知
     * 在后置通知里还不能访问目标方法执行的结果
     * @param joinPoint
     */
    @After("execution(* com.wqq.spring.controller.spring_aop.before.*.save(String))")
    public void AfterMethod(JoinPoint joinPoint){

        //目标方法名
        String methodName=joinPoint.getSignature().getName();
        //目标方法参数
        List<Object> arges= Arrays.asList(joinPoint.getArgs());
        System.out.println("The Method " + methodName +  " ends" + arges);
    }

}
