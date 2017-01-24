package com.geng.attr;

/**
 * Created by geng
 * on 2017/1/23.
 */
public class Person {

    private String pName;

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void test() {
        System.out.println("result: " + pName);
    }
}