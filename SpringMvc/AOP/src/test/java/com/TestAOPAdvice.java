package com;

import com.advice.biz.AspectBiz;
import com.unit.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by jacky on 2016/3/16.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPAdvice extends UnitTestBase{
    public TestAOPAdvice()
    {
        super("classpath:spring-advice.xml");
    }
    @Test
    public void testBiz() {
        AspectBiz biz=super.getBean("aspectbizbean");
        biz.biz();
    }
    @Test
    public void testBizInit() {
        AspectBiz biz=super.getBean("aspectbizbean");
        biz.init("jacky", 10);
    }
}
