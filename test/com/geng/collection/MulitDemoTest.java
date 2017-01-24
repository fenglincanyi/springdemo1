package com.geng.collection;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by geng
 * on 2017/1/24.
 */
public class MulitDemoTest {

    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("beans1.xml");
    }

    @Test
    public void testAll() {
        MulitDemo mulitDemo = (MulitDemo) context.getBean("mulitDemo");
        mulitDemo.showAll();
    }
}