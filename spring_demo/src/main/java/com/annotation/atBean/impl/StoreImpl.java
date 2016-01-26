package com.annotation.atBean.impl;

import com.annotation.atBean.interfaces.IStore;

/**
 * Created by jacky on 2016/1/26.
 */
public class StoreImpl implements IStore {
    public void init()
    {
        System.out.println("this is init");
    }
    public void destroy()
    {
        System.out.println("this is destroy");
    }

}
