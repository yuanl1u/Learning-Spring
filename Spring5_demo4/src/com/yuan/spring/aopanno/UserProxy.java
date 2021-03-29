package com.yuan.spring.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Yuan Liu
 * @create 2021-03-15 7:50 下午
 */

// 增强类
@Component
// 生成代理对象
@Aspect
public class UserProxy {

    // 前置通知
    // 配置切入点
    @Before(value = "execution(* com.yuan.spring.aopanno.User.add(..))")
    public void before(){
        System.out.println("before...");
    }

    // 最终通知 方法执行之后执行 无论有无异常都执行
    @After(value = "execution(* com.yuan.spring.aopanno.User.add(..))")
    public void after(){
        System.out.println("after...");
    }

    // 返回值之后执行
    @AfterReturning(value = "execution(* com.yuan.spring.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("after returning...");
    }

    // 异常通知
    @AfterThrowing(value = "execution(* com.yuan.spring.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("after throwing...");
    }

    // 环绕通知 在方法执行前后都执行
    @Around(value = "execution(* com.yuan.spring.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("before around...");
        // 执行被增强方法(User.add())
        proceedingJoinPoint.proceed();
        System.out.println("after around...");
    }
}
