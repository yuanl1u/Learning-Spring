package com.yuan.spring.collectionType;

/**
 * @author Yuan Liu
 * @create 2021-03-12 7:43 下午
 */
public class Course {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
