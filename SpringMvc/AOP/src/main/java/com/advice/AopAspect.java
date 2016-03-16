package com.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by jacky on 2016/3/16.
 */
public class AopAspect {
    public void before()
    {
        System.out.println("before=======");
    }
    public void afterReturning()
    {
        System.out.println("afterReturning=======");
    }
    public void afterThrowing()
    {
        System.out.println("afterThrowing=======");
    }
    public void after()
    {
        System.out.println("after=======");
    }
    public Object aroundinit(ProceedingJoinPoint pjp,String bizName,int times) throws Throwable {
        System.out.println("bizName:"+bizName+" times:"+times);
        System.out.println("aroundinit start==============");
        Object obj=pjp.proceed();
        System.out.println("aroundinit end==============");
        return obj;
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around start==============");
        Object obj=pjp.proceed();
        System.out.println("around end==============");
        return obj;
    }
}
