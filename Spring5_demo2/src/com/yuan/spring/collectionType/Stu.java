package com.yuan.spring.collectionType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Yuan Liu
 * @create 2021-03-11 7:34 下午
 */
public class Stu {
    // 1. 创建数组类型属性
    private String[] courses;
    // 2. 创建List集合
    private List<String> list;
    // 3. 创建Map集合
    private Map<String, String> maps;
    // 4. 创建Set集合
    private Set<String> sets;
    // 5. 创建对象集合(课程)
    private List<Course> courseList;


    // 生成对应的Setter方法
    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void test(){
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(courseList);
    }

}
