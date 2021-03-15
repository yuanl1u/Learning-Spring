package com.yuan.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author Yuan Liu
 * @create 2021-03-15 4:30 下午
 */
public class JDKProxy {
    public static void main(String[] args) {

        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        // 创建接口实现类的代理对象
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = dao.add(1, 2);
        System.out.println("result = " + result);
    }
}


// 创建代理对象代码
class UserDaoProxy implements InvocationHandler {
    // 1. 把创建的是谁的代理对象，把"谁"给传进来
    // 可以通过 有参构造 传进来
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }

    // 对象一旦被创建，invoke代码就会被调用，因此invoke方法中写你要增强的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在方法之前做的处理
        System.out.println("在" + method.getName() + "方法之前执行, 传递的参数: " + Arrays.toString(args));
        // 被增强的方法
        Object res = method.invoke(obj, args);
        // 在方法之后做的处理
        System.out.println("方法之后执行, 执行结果" + obj);

        return res;
    }
}