package com.yuan.spring.dao;

import com.yuan.spring.entity.Book;

import java.util.List;

/**
 * @author Yuan Liu
 * @create 2021-03-30 7:09 下午
 */
public interface BookDao {

    // "添加"方法
    void add(Book book);

    void updateBook(Book book);

    void deleteBook(String id);

    int selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBooks();
}
