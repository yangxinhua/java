package com.annotation.jsr.services.impl;

import com.annotation.jsr.dao.impl.JsrDAOImpl;
import com.annotation.jsr.services.interfaces.IJsrService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by jacky on 2016/1/26.
 */
@Service
public class JsrServiceImpl implements IJsrService{
    //resource注解可以直接放在成员前，或者通过set方法实现注入。效果等同。
    @Resource
    public void setJsrdaoimpl(JsrDAOImpl jsrdaoimpl) {
        this.jsrdaoimpl = jsrdaoimpl;
    }

    //    @Resource
    private JsrDAOImpl jsrdaoimpl;

    @PostConstruct
    public void init()
    {
        System.out.println("jsr init");
    }
    @PreDestroy
    public void destory()
    {
        System.out.println("jsr destory");
    }
    public void save()
    {
        jsrdaoimpl.save();
    }
}
