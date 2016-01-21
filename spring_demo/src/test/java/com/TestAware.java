package com;

import org.junit.Test;

/**
 * Created by jacky on 2016/1/21.
 */
public class TestAware extends UnitTestBase {
    public TestAware()
    {
        super(("classpath*:spring-ioc.xml"));
    }

    @Test
    public void testApplicationContext()
    {
        System.out.println(super.getBean("awareApplicationContext"));
    }

    @Test
    public void testBeanName()
    {
        System.out.println(super.getBean("awareBeanName"));
    }
}

