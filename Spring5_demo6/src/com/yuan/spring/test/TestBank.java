package com.yuan.spring.test;

import com.yuan.spring.config.TxConfig;
import com.yuan.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuan Liu
 * @create 2021-03-30 8:19 下午
 */
public class TestBank {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    UserService userService = context.getBean("userService", UserService.class);

    // 转账测试
    @Test
    public void testAccount(){
        userService.accountMoney();
    }

    // XML方式配置事务 转账测试
    @Test
    public void testXmlAccount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    // 完全注解方式配置事务
    @Test
    public void completeAnnotationAccount(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

}
