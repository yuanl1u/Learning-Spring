package com.yuan.spring.facBean;

import com.yuan.spring.collectionType.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Yuan Liu
 * @create 2021-03-14 4:54 下午
 */
public class MyBean implements FactoryBean<Course> {
    // 定义MyBean类型可以和返回类型不一样
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("fromFacBean");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
