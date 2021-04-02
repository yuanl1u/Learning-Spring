package com.yuan.spring.service;

import com.yuan.spring.dao.BookDao;
import com.yuan.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yuan Liu
 * @create 2021-03-30 7:09 下午
 */
@Service
public class BookService {
    // 注入Dao
    @Autowired
    private BookDao bookDao;

    // 添加方法
    public void addBook(Book book) {
        bookDao.add(book);
    }
}
