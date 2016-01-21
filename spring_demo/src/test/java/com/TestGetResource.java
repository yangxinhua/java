package com;

import com.resources.services.impl.ResourcesServiceImpl;
import org.junit.Test;

/**
 * Created by jacky on 2016/1/21.
 */
public class TestGetResource extends UnitTestBase {
    public  TestGetResource()
    {
        super(("classpath*:spring-ioc.xml"));
    }

    @Test
    public void testGetResource() throws Exception {
        ResourcesServiceImpl rsi=super.getBean("beanResourcesServiceImpl");
        rsi.resource();
    }
}
