package com.geng.attr;

/**
 * Created by geng
 * on 2017/1/23.
 */
public class People {

    private String name;

    public People(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "姓名："+ name;
    }
}
