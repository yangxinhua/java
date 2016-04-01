/**
 * $Id: TestIOC.java,v 1.0 2016/8/21 15:57 jacky Exp $
 * <p/>
 * Copyright 2016 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package com.ioc;

import com.ioc.bean.Reader;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jacky
 * @version $Id: TestIOC.java,v 1.1 2016/8/21 15:57 jacky Exp $
 * Created on 2016/8/21 15:57
 */
public class TestIOC {
    @Test
    public void testBook()
    {
        ApplicationContext factory=new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        Reader reader= (Reader) factory.getBean("reader");

    }
}
