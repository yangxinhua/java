package com.annotation;

import com.annotation.services.interfaces.IBeanMultiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by jacky on 2016/1/21.
 */
@Component
public class BeanInvoker {
    @Autowired
    private List<IBeanMultiService> list;
    @Autowired
    private Map<String,IBeanMultiService> map;
    @Autowired
    @Qualifier("beanMutilServiceImplTwo")
    private IBeanMultiService ibs;
    public void say() {
        if (null!=list&&list.size()>0)
        {
            for(IBeanMultiService ibs:list)
            {
                System.out.println("list"+ibs.getClass().getName());
            }
        }else
        {
            System.out.println("list is null");
        }
        if (null!=map&&map.size()>0)
        {
           for(Map.Entry<String,IBeanMultiService> entry:map.entrySet())
           {
               System.out.println("key:"+entry.getKey()+" classname:"+entry.getValue().getClass().getName());
           }
        }else
        {
            System.out.println("map is null");
        }
        if(null!=ibs)
        {
            System.out.println("class:"+ibs.getClass().getName());
        }else
        {
            System.out.println("ibs is null");
        }
    }
}
