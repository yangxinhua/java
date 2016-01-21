package com.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * Created by jacky on 2016/1/21.
 */
@Component("beanAnnotation")
//@Scope("prototype")
@Scope("singleton")
public class BeanAnnotation {
    public  void say(String s)
    {
        System.out.println("BeanAnnotation say:"+s);
    }
}
