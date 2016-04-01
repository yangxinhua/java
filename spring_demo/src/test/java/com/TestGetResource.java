package com;

import com.resources.services.impl.ResourcesServiceImpl;
import com.resources.services.interfaces.IResourcesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jacky on 2016/1/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring-ioc.xml"})
public class TestGetResource {

    @Autowired
    public IResourcesService iResourcesService;
    @Test
    public void testGetResource() throws Exception {
        iResourcesService.resource();
    }
}
