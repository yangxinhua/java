package com.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by jacky on 2016/1/20.
 */
public class BeanLifeCycle implements InitializingBean,DisposableBean {
    public void destroy() throws Exception {
        System.out.println("BeanLifeCycle end==============");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanLifeCycle start==============");
    }
//    public void start()
//    {
//        System.out.println("BeanLifeCycle start==============");
//    }
//    public void end()
//    {
//        System.out.println("BeanLifeCycle end==============");
//    }
}
