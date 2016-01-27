package com.annotation.jsr.services.impl;

import com.annotation.jsr.dao.impl.JsrDAOImpl;
import com.annotation.jsr.services.interfaces.IJsrService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by jacky on 2016/1/26.
 */
//@Service
    @Named
public class JsrServiceImpl implements IJsrService{
    //resourceע�����ֱ�ӷ��ڳ�Աǰ������ͨ��set����ʵ��ע�롣Ч����ͬ��
//    @Resource
    @Inject
    public void setJsrdaoimpl(@Named("jsrDAOImpl")JsrDAOImpl jsrdaoimpl) {
        this.jsrdaoimpl = jsrdaoimpl;
    }//ͨ��namedָ��bean��Ӧʵ�����ƣ����������һ���ӿڶ�Ӧ���ʵ�ֵ����⡣

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
