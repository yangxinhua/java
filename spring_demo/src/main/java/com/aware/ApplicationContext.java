package com.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by jacky on 2016/1/21.
 */
public class ApplicationContext implements ApplicationContextAware {
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext:"+applicationContext.getBean("awareApplicationContext"));
    }
}
