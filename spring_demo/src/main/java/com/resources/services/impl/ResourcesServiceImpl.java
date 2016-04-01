package com.resources.services.impl;

import com.resources.services.interfaces.IResourcesService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

/**
 * Created by jacky on 2016/1/21.
 */
@Component
public class ResourcesServiceImpl implements IResourcesService {
    public void resource() throws Exception
    {
        System.out.println("xxxx1");
    }
}
