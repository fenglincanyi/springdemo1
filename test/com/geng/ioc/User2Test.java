package com.geng.ioc;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by geng
 * on 2017/1/23.
 */
public class User2Test {

    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("beans1.xml");
    }

    @Test
    public void add() throws Exception {
        // getBean() 能够获取 id/name 属性的值
        User2 user2 = (User2) context.getBean("_user2");
        User2 user2_ = (User2) context.getBean("_user2");
        System.out.println(user2);
        System.out.println(user2 == user2_); //true  prototype: false 多实例
        user2.add();
    }

}