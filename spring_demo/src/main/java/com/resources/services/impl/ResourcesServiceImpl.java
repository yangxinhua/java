package com.resources.services.impl;

import com.resources.services.interfaces.IResourcesService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

/**
 * Created by jacky on 2016/1/21.
 */
public class ResourcesServiceImpl implements IResourcesService,ApplicationContextAware {
    private ApplicationContext ac;
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ac=applicationContext;
    }

    public void resource() throws Exception
    {
        Resource resource= ac.getResource("http://v1.mukewang.com/81e7027b-52d0-48d8-827a-22e41021b643/H.mp4");
//        Resource resource= ac.getResource("classpath:spring-ioc.xml");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}
