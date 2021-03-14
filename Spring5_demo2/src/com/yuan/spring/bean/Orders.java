package com.yuan.spring.bean;

/**
 * @author Yuan Liu
 * @create 2021-03-14 5:22 下午
 */
public class Orders {
    private String oname;

    public Orders() {
        System.out.println("1. 执行无参数构造 创建bean的实例");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("2. 调用setter方法设置属性的值");
    }

    // 创建执行初始化的方法
    public void initMethod(){
        System.out.println("3. 执行初始化方法");
    }

    // 销毁实例方法，需要手动调用
    public void destoryMethod(){
        System.out.println("5. 执行销毁方法");
    }
}
