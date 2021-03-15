package com.yuan.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yuan Liu
 * @create 2021-03-15 3:09 下午
 */

// 把当前类作为配置类 代替xml文件
@Configuration
@ComponentScan(basePackages = {"com.yuan"})
public class SpringConfig {

}
