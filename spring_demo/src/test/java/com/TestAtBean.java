package com;

import com.annotation.atBean.interfaces.IStore;
import org.junit.Test;

/**
 * Created by jacky on 2016/1/26.
 */
public class TestAtBean extends UnitTestBase {
    public TestAtBean()
    {
        super("classpath*:spring-annotation.xml");
    }

    @Test
    public void testAtBean()
    {
        IStore store=super.getBean("storeImpl");
        System.out.println("bean classname:"+store.getClass().getName());
    }
}
