package com;

public class Main {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " 线程运行开始!");
        new MitiSay("A").start();
        new MitiSay("B").start();
        System.out.println(Thread.currentThread().getName() + " 线程运行结束!");
    }
}
