package com;

import com.annotation.BeanInvoker;
import org.junit.Test;

/**
 * Created by jacky on 2016/1/21.
 */
public class TestBeanMulti extends UnitTestBase {
    public TestBeanMulti()
    {
        super("classpath*:spring-annotation.xml");
    }

    @Test
    public void testBeanMulti()
    {
        BeanInvoker bi=super.getBean("beanInvoker");
        bi.say();
    }

}
