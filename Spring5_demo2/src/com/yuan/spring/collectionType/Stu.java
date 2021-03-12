package com.yuan.spring.collectionType;
import java.util.List;
import java.util.Map;

/**
 * @author Yuan Liu
 * @create 2021-03-11 7:34 下午
 */
public class Stu {
    // Array type parameter
    private String[] courses;

    public void setList(List<String> list) {
        this.list = list;
    }

    // List type
    private List<String> list;

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    private Map<String, String> maps;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

}
