package com.yuan.spring.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Yuan Liu
 * @create 2021-03-16 11:33
 */
@Component
@Aspect
// @Order来设置不同增强类对同一个类增强时的优先级，数字越小优先级越高
@Order(1)
public class PersonProxy {

    @Before(value="execution(* com.yuan.spring.aopanno.User.add(..))")
    public void before(){
        System.out.println("Person's before...");
    }
}
