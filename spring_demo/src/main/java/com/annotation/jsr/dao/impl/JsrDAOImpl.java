package com.annotation.jsr.dao.impl;

import com.annotation.jsr.dao.interfaces.IJsrDAO;
import org.springframework.stereotype.Repository;

/**
 * Created by jacky on 2016/1/26.
 */
@Repository
public class JsrDAOImpl implements IJsrDAO{

    public void save() {
        System.out.println("dao save");
    }
}
