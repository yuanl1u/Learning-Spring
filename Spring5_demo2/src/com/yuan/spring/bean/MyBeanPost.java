package com.yuan.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Yuan Liu
 * @create 2021-03-14 5:48 下午
 */
public class MyBeanPost implements BeanPostProcessor {
    // 在初始化之前执行
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后置处理器：初始化之前执行的方法");
        return bean;
    }
    // 在初始化之后执行
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后置处理器：初始化之后执行的方法");
        return bean;
    }
}
