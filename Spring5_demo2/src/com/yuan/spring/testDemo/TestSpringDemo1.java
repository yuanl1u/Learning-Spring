package com.yuan.spring.testDemo;

import com.yuan.spring.collectionType.Book;
import com.yuan.spring.collectionType.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author Yuan Liu
 * @create 2021-03-12 7:05 下午
 */
public class TestSpringDemo1 {

    @Test
    public void testCollections(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    @Test
    // 测试 对象集合
    public void testClassCollections(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    // 测试容器变量外置注入
    // 要在xml种引入util包
    @Test
    public void testExternalCollections(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Book book = context.getBean("book", Book.class);
        book.test();
    }
}
