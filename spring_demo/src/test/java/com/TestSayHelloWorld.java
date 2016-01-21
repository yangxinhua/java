package com;

import com.ioc.services.impl.SayHelloWorldImpl;
import com.ioc.services.interfaces.ISayHelloWorld;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by jacky on 2016/1/20.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestSayHelloWorld extends UnitTestBase{

    public TestSayHelloWorld()
    {
        super("classpath*:spring-ioc.xml");
    }
    @Test
    public void testSay()
    {
        ISayHelloWorld ishw=new SayHelloWorldImpl();
        System.out.println(ishw.say("hello world"));
    }

    @Test
    public void testSayBySpring()
    {
        ISayHelloWorld ishw=super.getBean("isyshelloworld");
        System.out.println(ishw.say("hello world by spring"));
    }


}
