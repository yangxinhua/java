package com.aware;

import org.springframework.beans.factory.BeanNameAware;

/**
 * Created by jacky on 2016/1/21.
 */
public class BeanName implements BeanNameAware {
    public void setBeanName(String name) {
        System.out.println("beanname:"+name);
    }
}
