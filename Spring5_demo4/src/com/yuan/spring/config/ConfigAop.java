package com.yuan.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Yuan Liu
 * @create 2021-03-16 11:45
 */

// 完全使用注解开发 无需配置XML文件 创建此配置类即可
@Configuration
// 代替 <context:component-scan base-package="com.yuan.spring.aopanno"></context:component-scan>
@ComponentScan(basePackages = {"com.yuan"})
// 代替 <aop:aspectj-autoproxy></aop:aspectj-autoproxy>
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {

}
