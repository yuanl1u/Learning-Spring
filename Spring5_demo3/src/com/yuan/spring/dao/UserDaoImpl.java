package com.yuan.spring.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Yuan Liu
 * @create 2021-03-15 2:46 下午
 */
@Repository(value="userDaoImpl1")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao add...");
    }
}
