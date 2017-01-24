package com.geng.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by geng
 * on 2017/1/23.
 */
public class MulitDemo {

    private String[] arrs;
    private List<String> list;
    private Map<String, String> map;
    private Properties properties;

    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void showAll() {
        System.out.println(arrs);
        System.out.println(list);
        System.out.println(map);
        System.out.println(properties);
    }
}
