package com.yuan.spring.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Yuan Liu
 * @create 2021-03-16 10:54
 */

// 增强类
@Component
@Aspect
@Order(3)
public class UserProxy {
    // 抽取相同切入点: 避免重复编写 + 方便统一修改
    @Pointcut(value="execution(* com.yuan.spring.aopanno.User.add(..))")
    public void pointDemo(){

    }

    // 前置通知 @Before注解表示前置通知 同时加上切入点表达式配置
    @Before(value="pointDemo()")
    public void before(){
        System.out.println("before...");
    }

    // 最终通知 无论有没有异常 都执行
    @After(value="pointDemo()")
    public void after(){
        System.out.println("after...方法之后执行");
    }

    // 返回通知 / 后置通知
    @AfterReturning(value="pointDemo()")
    public void afterReturning(){
        System.out.println("after Returning...方法返回结果之后执行");
    }

    // 异常通知
    @AfterThrowing(value="pointDemo()")
    public void afterThrowing(){
        System.out.println("after Throwing...");
    }

    // 环绕通知
    @Around(value="pointDemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前...");
        //被增强的方法增强
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后...");
    }


}
