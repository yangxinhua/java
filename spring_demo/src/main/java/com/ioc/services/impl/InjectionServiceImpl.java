package com.ioc.services.impl;

import com.ioc.dao.interfaces.IInjectionDao;
import com.ioc.services.interfaces.IInjectionService;

/**
 * Created by jacky on 2016/1/20.
 */
public class InjectionServiceImpl implements IInjectionService {
    private IInjectionDao injectiondao;
    public IInjectionDao getInjectiondao() {
        return injectiondao;
    }

    public InjectionServiceImpl(IInjectionDao injectiondao) {
        this.injectiondao = injectiondao;
    }

    //设置注入
    public void setInjectiondao(IInjectionDao injectiondao) {
        this.injectiondao = injectiondao;
    }


    public void save(String s) {
        System.out.println("service 接收参数："+s);
        injectiondao.save(s);
    }
}
