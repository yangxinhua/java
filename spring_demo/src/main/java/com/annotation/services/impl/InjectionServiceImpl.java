package com.annotation.services.impl;

import com.annotation.dao.interfaces.IInjectionDao;
import com.annotation.services.interfaces.IInjectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jacky on 2016/1/20.
 */
@Service
public class InjectionServiceImpl implements IInjectionService {
    @Autowired
    public InjectionServiceImpl(IInjectionDao injectiondao) {
        this.injectiondao=injectiondao;
    }

    @Autowired
    public void setInjectiondao(IInjectionDao injectiondao) {
        this.injectiondao = injectiondao;
    }

    @Autowired
    private IInjectionDao injectiondao;
    public void save(String s) {
        System.out.println("service 接收参数："+s);
        injectiondao.save(s);
    }
}
