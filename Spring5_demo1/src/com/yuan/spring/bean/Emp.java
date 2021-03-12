package com.yuan.spring.bean;

import com.sun.org.apache.xpath.internal.objects.XString;

/**
 * @author Yuan Liu
 * @create 2021-03-11 6:47 下午
 */
// 员工类
public class Emp {
    private String ename;
    private String gender;

    public Dept getDept() {
        return dept;
    }

    // 员工属于某一个部门，使用对象形式表示
    private Dept dept;

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void add(){
        System.out.println(ename + " : " + gender + " : " + dept.toString());
    }
}
