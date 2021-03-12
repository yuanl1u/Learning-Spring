package com.yuan.spring.test;

import com.yuan.spring.bean.Emp;
import com.yuan.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Yuan Liu
 * @create 2021-03-11 6:13 下午
 */
public class TestDemo {

    @Test
    public void testOutterBean(){
        // 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        // 使用对象的方法
        userService.add();
    }

    @Test
    public void testInnerBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        Emp employee = context.getBean("emp", Emp.class);

        employee.add();
    }

    @Test
    public void testConcateBeanOne(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        Emp employee = context.getBean("emp", Emp.class);

        employee.add();
    }

    @Test
    public void testConcateBeanTwo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        Emp employee = context.getBean("emp", Emp.class);

        employee.add();
    }


}
