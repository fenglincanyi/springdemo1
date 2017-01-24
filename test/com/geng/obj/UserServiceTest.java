package com.geng.obj;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by geng
 * on 2017/1/23.
 */
public class UserServiceTest {

    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("beans1.xml");
    }

    @Test
    public void showService() throws Exception {
        UserService userService = (UserService) context.getBean("userService");
        userService.showService();
    }

}