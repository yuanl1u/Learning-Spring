package com.yuan.spring.service;

import com.yuan.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Yuan Liu
 * @create 2021-03-15 2:26 下午
 */

// value = <bean id="userService" class="..."></bean>
// 如果(value = "userService")不写 value默认值就是类名首字母小写 userService
// @Component @Service @Controller @Repository 使用上没区别
@Service(value = "userService")
public class UserService {
    // 定义Dao类型属性
    // 不需要加set方法 只要添加注解就行了
    // autowired根据类型注入; qualifier根据名称注入; 两者必须一起使用
//    @Autowired
//    @Qualifier(value="userDaoImpl1")
    // resource 既可以根据类型 又可以根据名称(不加name就是根据类型)
    // resource不是spring的包是javax的 更推荐使用autowired和qualifier
    @Resource(name="userDaoImpl1")
    private UserDao userDao;

    // Value注解 注入属性值
    @Value(value="abc")
    private String name;

    public void add(){
        System.out.println("service add...");
        userDao.add();
        System.out.println("name = " + name);
    }
}
