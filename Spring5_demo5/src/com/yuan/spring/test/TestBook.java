package com.yuan.spring.test;

import com.yuan.spring.entity.Book;
import com.yuan.spring.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Yuan Liu
 * @create 2021-03-30 8:19 下午
 */
public class TestBook {

    // 添加
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("1");
        book.setUserName("java");
        book.setUstatus("a");
        bookService.addBook(book);
    }

    // 修改
    @Test
    public void updateThroughJdbc(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("1");
        book.setUserName("javaUpUp");
        book.setUstatus("yuan");
        bookService.updateBook(book);
    }

    // 删除
    @Test
    public void deleteThroughJdbc(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.deleteBook("1");
    }

    // 查询返回某个值
    @Test
    public void queryValueThroughJdbc(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        int count = bookService.findCount();
        System.out.println("count = " + count);
    }

    // 查询返回对象
    @Test
    public void queryObjectThroughJdbc(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = bookService.findOne("1");
        System.out.println("book = " + book);
    }

    // 查询返回集合
    @Test
    public void queryListThroughJdbc(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Book> bookList = bookService.findAll();
        System.out.println("bookList = " + bookList);
    }
}
