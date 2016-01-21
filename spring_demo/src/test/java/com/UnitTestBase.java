package com;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * Created by jacky on 2016/1/20.
 */
public class UnitTestBase {
    private ClassPathXmlApplicationContext context;
    private String springXmlPath;
    public UnitTestBase()
    {

    }
    public UnitTestBase(String springXmlPath)
    {
        this.springXmlPath=springXmlPath;
    }

    @Before
    public void before()
    {
        if(StringUtils.isEmpty(springXmlPath))
        {
            springXmlPath="classpath*:spring-*.xml";
        }
        try
        {
            context=new ClassPathXmlApplicationContext((springXmlPath.split("[,\\s]]+")));
            context.start();
        }catch (BeansException e)
        {
            e.printStackTrace();
            throw e;
        }
    }
    @After
    public void after()
    {
        context.destroy();
    }

    protected <T extends  Object>T getBean(String beanId)
    {
        return (T)context.getBean(beanId);
    }
    protected  <T extends  Object>T getBean(Class<T>  clazz)
    {
        return context.getBean(clazz);
    }
}
