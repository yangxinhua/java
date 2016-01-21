package com.autowiring.dao.impl;

import com.autowiring.dao.interfaces.IAutoWiringDao;

import javax.sound.midi.Soundbank;

/**
 * Created by jacky on 2016/1/21.
 */
public class AutoWiringDaoImpl implements IAutoWiringDao {
    public void say(String s) {
        System.out.println("dao say:"+s);
    }
}
