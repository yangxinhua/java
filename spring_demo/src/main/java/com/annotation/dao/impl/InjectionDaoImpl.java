package com.annotation.dao.impl;


import com.annotation.dao.interfaces.IInjectionDao;
import org.springframework.stereotype.Repository;

/**
 * Created by jacky on 2016/1/20.
 */
@Repository
public class InjectionDaoImpl implements IInjectionDao {
    public void save(String s) {
        System.out.println("dao 保存数据:"+s);
    }
}
