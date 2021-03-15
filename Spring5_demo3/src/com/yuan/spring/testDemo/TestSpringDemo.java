package com.yuan.spring.testDemo;


import com.yuan.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Yuan Liu
 * @create 2021-03-12 7:05 下午
 */
public class TestSpringDemo {
    @Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println("userService = " + userService);
        userService.add();
    }

}
