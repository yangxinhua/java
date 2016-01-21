package com;

import com.bean.BeanLifeCycle;
import org.junit.Test;

/**
 * Created by jacky on 2016/1/20.
 */
public class TestBeanLifeCycle extends UnitTestBase{
    public TestBeanLifeCycle()
    {
        super(("classpath*:spring-ioc.xml"));
    }

    @Test
    public void testBeanLifeCycle()
    {
        BeanLifeCycle blc=super.getBean("beanLifeCycle");
    }
}
