package com.autowiring.services.impl;

import com.autowiring.dao.interfaces.IAutoWiringDao;
import com.autowiring.services.interfaces.IAutoWiringService;

/**
 * Created by jacky on 2016/1/21.
 */
public class AutoWiringServiceImpl implements IAutoWiringService {
    public AutoWiringServiceImpl(IAutoWiringDao iautowiringdao) {
        System.out.println("constructor method");
        this.iautowiringdao = iautowiringdao;
    }

    public void setIautowiringdao(IAutoWiringDao iautowiringdao) {
        this.iautowiringdao = iautowiringdao;
    }

    private IAutoWiringDao iautowiringdao;

    public void say(String s) {
       iautowiringdao.say(s);
    }
}
