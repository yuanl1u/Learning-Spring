package com.yuan.spring.service;

import org.springframework.stereotype.Component;
/**
 * @author Yuan Liu
 * @create 2021-03-15 2:26 下午
 */

// value = <bean id="userService" class="..."></bean>
// 如果(value = "userService")不写 value默认值就是类名首字母小写 userService
// @Component @Service @Controller @Repository 使用上没区别
@Component(value = "userService")
public class UserService {

    public void add(){
        System.out.println("service add...");
    }
}
