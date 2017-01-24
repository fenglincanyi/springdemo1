package com.geng.attr;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by geng
 * on 2017/1/23.
 */
public class PersonTest {

    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("beans1.xml");
    }

    @Test
    public void test1() throws Exception {
        Person person = (Person) context.getBean("person");
        person.test();
    }

}