package com.yuan.spring.collectionType;

import java.util.List;

/**
 * @author Yuan Liu
 * @create 2021-03-12 8:05 下午
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test(){
        System.out.println(list);
    }
}
