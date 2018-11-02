package com.wqq.spring.controller.spring_aop.after;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//把这个类声明一个切面:需要把类放入到IOC容器中,在声明为一个切面
@Aspect
@Component
public class LoggingAspect {
    @Before("execution(public int com.wqq.spring.controller.spring_aop.after.ArithmetiCalculatorImpl.*(..))")
    public void BeforeMethod(JoinPoint joinPoint){
        //目标方法名
        String methodName=joinPoint.getSignature().getName();
        //目标方法参数
        List<Object> arges= Arrays.asList(joinPoint.getArgs());
        System.out.println("The Method " + methodName +  " begins with" + arges);
    }
    @After("execution(public int com.wqq.spring.controller.spring_aop.after.ArithmetiCalculatorImpl.*(..))")
    public void AfterMethod(JoinPoint joinPoint){
        //目标方法名
        String methodName=joinPoint.getSignature().getName();
        //目标方法参数
        List<Object> arges= Arrays.asList(joinPoint.getArgs());
        System.out.println("The Method " + methodName +  " End with" + arges);
    }

    /**
     *
     * @param joinPoint
     * @param result
     */
    @AfterReturning(value="execution(public int com.wqq.spring.controller.spring_aop.after.ArithmetiCalculatorImpl.*(..)))",
    returning = "result")
    public void AfterReturning(JoinPoint joinPoint,Object result){
        //目标方法名
        String methodName=joinPoint.getSignature().getName();
        //目标方法参数
        List<Object> arges= Arrays.asList(joinPoint.getArgs());
        System.out.println("The Method " + methodName +  " after returning with " + result);


    }


}
