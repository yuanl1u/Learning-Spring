package com.yuan.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author Yuan Liu
 * @create 2021-04-03 3:19 下午
 */
public interface UserDao {

    public void addMoney();

    public void reduceMoney();

}
