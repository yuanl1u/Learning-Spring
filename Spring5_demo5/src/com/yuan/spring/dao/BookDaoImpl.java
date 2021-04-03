package com.yuan.spring.dao;

import com.yuan.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    // 修改
    @Override
    public void updateBook(Book book) {
        String sql = "UPDATE t_book SET username=?,ustatus=? where user_id=?";
        Object[] args = {book.getUserName(), book.getUstatus(), book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("update = " + update);
    }

    // 删除
    @Override
    public void deleteBook(String id) {
        String sql = "DELETE FROM t_book where user_id=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println("update = " + update);
    }

    // 查询表记录
    @Override
    public int selectCount() {
        String sql = "SELECT COUNT(*) FROM t_book";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public Book findBookInfo(String id) {
        String sql = "SELECT * FROM t_book WHERE user_id=?";
        // 调用方法
        // RowMapper是接口，根据返回的类型不同，会帮你实现不同的封装。e.g. 如果返回Book类型的，他就帮你封装到一个Book
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> findAllBooks() {
        String sql = "SELECT * FROM t_book";
        // 把得到的所有对象封装到Book里面 然后放入到List返回
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }
}
