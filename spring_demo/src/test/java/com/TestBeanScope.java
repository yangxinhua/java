package com;

import com.bean.BeanScope;
import org.junit.Test;

/**
 * Created by jacky on 2016/1/20.
 */
public class TestBeanScope extends UnitTestBase{
    public TestBeanScope()
    {
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void testBeanScopeSingleton()
    {
        BeanScope beanScopeSingleton1=super.getBean("beanScopeSingleton");
        beanScopeSingleton1.say();

        BeanScope beanScopeSingleton2=super.getBean("beanScopeSingleton");
        beanScopeSingleton2.say();
    }

    @Test
    public void testBeanScopePrototype()
    {
        BeanScope beanScopePrototype1=super.getBean("beanScopePrototype");
        beanScopePrototype1.say();

        BeanScope beanScopePrototype2=super.getBean("beanScopePrototype");
        beanScopePrototype2.say();
    }
}
