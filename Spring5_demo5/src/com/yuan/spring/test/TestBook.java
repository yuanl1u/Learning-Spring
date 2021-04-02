package com.yuan.spring.test;

import com.yuan.spring.entity.Book;
import com.yuan.spring.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Yuan Liu
 * @create 2021-03-30 8:19 下午
 */
public class TestBook {

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
}
