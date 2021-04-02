package com.yuan.spring.dao;

import com.yuan.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author Yuan Liu
 * @create 2021-03-30 7:09 下午
 */
@Repository
public class BookDaoImpl implements BookDao {

    // 注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 添加的方法
    @Override
    public void add(Book book) {
        // sql语句 具体参数使用update设置
        String sql = "INSERT INTO t_book VALUES(?,?,?)";
        // 可变参数
        Object[] args = {book.getUserId(), book.getUserName(), book.getUstatus()};
        // 使用update方法进行对数据库的增删改查
        // 参数1：sql语句，参数2：语句可变参数
        int update = jdbcTemplate.update(sql, args);
        System.out.println("update = " + update);
    }
}
