package com.yuan.spring.service;

import com.yuan.spring.dao.UserDao;
import com.yuan.spring.dao.UserDaoImpl;

/**
 * @author Yuan Liu
 * @create 2021-03-11 5:51 下午
 */
public class UserService {

    // 创建userDao类的属性
    private UserDao userDao;

    public void add(){
        System.out.println("service add...");
        // 原始方式
//        UserDao userDao = new UserDaoImpl();
//        userDao.update();
        userDao.update();

    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
