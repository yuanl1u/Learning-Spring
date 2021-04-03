package com.yuan.spring.service;

import com.yuan.spring.dao.BookDao;
import com.yuan.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    public void deleteBook(String id){
        bookDao.deleteBook(id);
    }

    // 查询有多少条记录
    public int findCount(){
        int count = bookDao.selectCount();
        return count;
    }

    // 查询返回对象
    public Book findOne(String id){
        Book book = bookDao.findBookInfo(id);
        return book;
    }

    // 查询返回集合
    public List<Book> findAll(){
        List<Book> bookList = bookDao.findAllBooks();
        return bookList;
    }

}
