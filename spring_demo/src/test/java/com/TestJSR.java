package com;

import com.annotation.jsr.services.interfaces.IJsrService;
import org.junit.Test;

/**
 * Created by jacky on 2016/1/26.
 */
public class TestJSR extends UnitTestBase{
    public TestJSR()
    {
        super("classpath*:spring-annotation.xml");
    }

    @Test
    public void testJsr()
    {
        IJsrService iJsrService=super.getBean("jsrServiceImpl");
        iJsrService.save();
    }
}
