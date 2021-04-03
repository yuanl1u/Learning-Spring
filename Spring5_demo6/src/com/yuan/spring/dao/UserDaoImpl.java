package com.yuan.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Yuan Liu
 * @create 2021-04-03 3:19 下午
 */

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 多钱的方法
    @Override
    public void addMoney() {
        String sql = "UPDATE t_account SET money=money+? WHERE username=?";
        jdbcTemplate.update(sql, 100, "mary");
    }

    // 少钱的方法
    @Override
    public void reduceMoney() {
        String sql = "UPDATE t_account SET money=money-? WHERE username=?";
        jdbcTemplate.update(sql, 100, "lucy");
    }
}
