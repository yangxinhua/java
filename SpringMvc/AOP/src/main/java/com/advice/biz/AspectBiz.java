package com.advice.biz;

/**
 * Created by jacky on 2016/3/16.
 */
public class AspectBiz {
    public void biz() {
        System.out.println("biz========");
//        throw new RuntimeException();
    }

    public void init(String bizName,int times)
    {
        System.out.println("init:"+bizName+"  times:"+times);
    }
}
