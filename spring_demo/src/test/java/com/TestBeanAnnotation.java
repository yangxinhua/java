package com;

import com.annotation.BeanAnnotation;
import com.annotation.services.impl.InjectionServiceImpl;
import org.junit.Test;

/**
 * Created by jacky on 2016/1/21.
 */
public class TestBeanAnnotation extends UnitTestBase {
    public TestBeanAnnotation()
    {
        super("classpath:spring-annotation.xml");
    }
    @Test
    public void testBeanAnnotation()
    {
        BeanAnnotation ba1=super.getBean("beanAnnotation");
        System.out.println(ba1.hashCode());
        ba1.say("hello world");

        BeanAnnotation ba2=super.getBean("beanAnnotation");
        System.out.println(ba2.hashCode());
        ba2.say("hello world");
    }

    @Test
    public void testAutowired()
    {
        InjectionServiceImpl isi=super.getBean("injectionServiceImpl");
        isi.save("hello world");
    }
}
