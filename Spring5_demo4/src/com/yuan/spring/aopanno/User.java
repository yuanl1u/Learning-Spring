package com.yuan.spring.aopanno;

import org.springframework.stereotype.Component;

/**
 * @author Yuan Liu
 * @create 2021-03-16 10:53
 */

// 被增强的类
@Component
public class User {
    public void add(){
        // 用来测试 异常通知
        // int i = 0/0;
        System.out.println("add...");
    }
}
