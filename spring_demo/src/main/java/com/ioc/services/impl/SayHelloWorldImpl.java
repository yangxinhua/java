package com.ioc.services.impl;

import com.ioc.services.interfaces.ISayHelloWorld;

/**
 * Created by jacky on 2016/1/20.
 */
public class SayHelloWorldImpl implements ISayHelloWorld {
    public String say(String s) {
        return "I say "+s;
    }
}
