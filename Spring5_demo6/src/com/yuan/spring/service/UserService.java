package com.yuan.spring.service;

import com.yuan.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Yuan Liu
 * @create 2021-04-03 3:19 下午
 */

@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ, readOnly = false)
// 7种传播, 4种隔离级别(脏读，不可重复读，幻读),
// readOnly只读不允许修改 rollbackFor/noRollbackFor设置出现哪些异常进行回滚
public class UserService {
    // 注入Dao
    @Autowired
    private UserDao userDao;

    // 开启事务注解，可以添加到类上面也可添加到方法上面
    // 添加到类上面，则类下的所有方法都开启事务
    // 添加到方法，则只有这个方法开启事务

    public void accountMoney(){
        // lucy少100
        userDao.reduceMoney();
        // 模拟异常
        int i = 1 / 0;
        // mary多100
        userDao.addMoney();
    }

}
