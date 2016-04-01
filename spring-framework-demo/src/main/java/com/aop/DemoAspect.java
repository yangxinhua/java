/**
 * $Id: DemoAspect.java,v 1.0 2016/9/1 17:50 jacky Exp $
 * <p/>
 * Copyright 2016 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;

/**
 * @author jacky
 * @version $Id: DemoAspect.java,v 1.1 2016/9/1 17:50 jacky Exp $
 * Created on 2016/9/1 17:50
 */
@Aspect
public class DemoAspect {
    @Pointcut("execution(public void say())")
    public void pointcutname()
    {
        System.out.println("pointcutname");
    }

    @Around("pointcutname()")
    public Object trace(ProceedingJoinPoint joinPoint) throws Throwable
    {
        StopWatch stopWatch=new StopWatch();
        try{
            stopWatch.start();
            return joinPoint.proceed();
        }finally {
            stopWatch.stop();
            System.out.println("joinPoint.getSignature().getName():"+joinPoint.getSignature().getName());
        }
    }
}
