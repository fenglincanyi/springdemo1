package com.geng.ioc;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by geng
 * on 2017/1/23.
 */
public class UserTest {

    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("beans1.xml");
    }

    @Test
    public void add() throws Exception {
        // 使用无参构造的 ！！！ 注意！！！
        User user = (User) context.getBean("user");
        user.add();
    }

}