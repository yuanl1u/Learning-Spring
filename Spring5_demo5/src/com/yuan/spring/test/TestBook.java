package com.yuan.spring.test;

import com.yuan.spring.entity.Book;
import com.yuan.spring.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuan Liu
 * @create 2021-03-30 8:19 下午
 */
public class TestBook {

    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    BookService bookService = context.getBean("bookService", BookService.class);
    // 添加
    @Test
    public void testJdbcTemplate(){
        Book book = new Book();
        book.setUserId("1");
        book.setUserName("java");
        book.setUstatus("a");
        bookService.addBook(book);
    }

    // 修改
    @Test
    public void updateThroughJdbc(){
        Book book = new Book();
        book.setUserId("1");
        book.setUserName("javaUpUp");
        book.setUstatus("yuan");
        bookService.updateBook(book);
    }

    // 删除
    @Test
    public void deleteThroughJdbc(){
        bookService.deleteBook("1");
    }

    // 查询返回某个值
    @Test
    public void queryValueThroughJdbc(){
        int count = bookService.findCount();
        System.out.println("count = " + count);
    }

    // 查询返回对象
    @Test
    public void queryObjectThroughJdbc(){
        Book book = bookService.findOne("1");
        System.out.println("book = " + book);
    }

    // 查询返回集合
    @Test
    public void queryListThroughJdbc(){
        List<Book> bookList = bookService.findAll();
        System.out.println("bookList = " + bookList);
    }

    // 批量添加
    @Test
    public void batchAddThroughJdbc(){
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3","java","a"};
        Object[] o2 = {"4","c++","b"};
        Object[] o3 = {"5","mysql","c"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchAdd(batchArgs);
    }

    // 批量修改
    @Test
    public void batchUpdateThroughJdbc(){
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"java_update","a","3"};
        Object[] o2 = {"c++_update","b","4"};
        Object[] o3 = {"mysql_update","c","5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchUpdate(batchArgs);
    }

    // 批量删除
    @Test
    public void batchDeleteThroughJdbc(){
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        Object[] o3 = {"5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchDelete(batchArgs);
    }
}
