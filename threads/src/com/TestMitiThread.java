/**
 * $Id: TestMitiThread.java,v 1.0 2016/8/19 15:17 jacky Exp $
 * <p/>
 * Copyright 2016 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package com;

/**
 * @author jacky
 * @version $Id: TestMitiThread.java,v 1.1 2016/8/19 15:17 jacky Exp $
 * Created on 2016/8/19 15:17
 */
public class TestMitiThread implements Runnable {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " 线程运行开始!");
        TestMitiThread test = new TestMitiThread();
        Thread thread1 = new Thread(test);
        Thread thread2 = new Thread(test);
        thread1.start();
        thread2.start();
        System.out.println(Thread.currentThread().getName() + " 线程运行结束!");

    }



    public void run() {
        System.out.println(Thread.currentThread().getName() + " 线程运行开始!");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " 线程运行结束!");
    }
}
