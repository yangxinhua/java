package com;

import com.annotation.JdbcDriverManager;
import com.annotation.atBean.interfaces.IStore;
import org.junit.Test;

/**
 * Created by jacky on 2016/1/26.
 */
public class TestAtImportResource extends UnitTestBase
{
    public TestAtImportResource()
    {
        super("classpath*:spring-annotation.xml");
    }

    @Test
    public void testAtImportResource()
    {
        JdbcDriverManager jdbcdrivermanager=super.getBean("jdbcdrivermanager");
    }
}
