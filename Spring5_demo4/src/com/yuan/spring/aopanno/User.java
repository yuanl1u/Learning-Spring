package com.yuan.spring.aopanno;

import org.springframework.stereotype.Component;

/**
 * @author Yuan Liu
 * @create 2021-03-15 7:50 下午
 */

// 被增强类
@Component
public class User {

    public void add(){
        // 用来测试异常通知
//        int i = 10 / 0;
        System.out.println("add...");
    }
}
