/**
 * $Id: MitiSay.java,v 1.0 2016/8/19 15:05 jacky Exp $
 * <p/>
 * Copyright 2016 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package com;

/**
 * @author jacky
 * @version $Id: MitiSay.java,v 1.1 2016/8/19 15:05 jacky Exp $
 * Created on 2016/8/19 15:05
 */
public class MitiSay extends Thread {
    public MitiSay(String threadName) {
        super(threadName);
    }
    public void run() {
        System.out.println(getName() + " 线程运行开始!");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " 线程运行结束!");
    }
}