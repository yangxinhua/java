package com;

import com.ioc.services.interfaces.IInjectionService;
import org.junit.Test;

/**
 * Created by jacky on 2016/1/20.
 */
public class TestInjectService extends UnitTestBase {
    public TestInjectService()
    {
        super("classpath*:spring-ioc.xml");
    }
//    @TestJson
//    public void testInjectBySetting()
//    {
//        IInjectionService is=super.getBean("injectionServiceImplBySetting");
//        is.save("i am to save");
//    }

    @Test
    public void testInjectByConductor()
    {
        IInjectionService is=super.getBean("injectionServiceImplByConstructor");
        is.save("i am to save");
    }
}
