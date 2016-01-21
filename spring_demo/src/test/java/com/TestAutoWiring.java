package com;

import com.autowiring.services.impl.AutoWiringServiceImpl;
import org.junit.Test;

/**
 * Created by jacky on 2016/1/21.
 */
public class TestAutoWiring extends UnitTestBase {
    public TestAutoWiring()
    {
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void TestAutoWiring()
    {
        AutoWiringServiceImpl aws=super.getBean("beanAutoWiringServiceImpl");
        aws.say("hello world");
    }
}
