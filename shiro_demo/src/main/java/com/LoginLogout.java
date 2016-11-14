/**
 * $Id: LoginLogout.java,v 1.0 2016/4/17 20:11 jacky Exp $
 * <p/>
 * Copyright 2016 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package com;

import junit.framework.Assert;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.Authenticator;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniFactorySupport;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.apache.shiro.util.ThreadContext;
import org.junit.After;
import org.junit.Test;

import java.sql.Connection;

/**
 * @author jacky
 * @version $Id: LoginLogout.java,v 1.1 2016/4/17 20:11 jacky Exp $
 *          Created on 2016/4/17 20:11
 */
public class LoginLogout {
    public void loginByIni() {
        //1����ȡSecurityManager�������˴�ʹ��Ini�����ļ���ʼ��SecurityManager
        Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory("classpath:user-auth.ini");

        //2���õ�SecurityManagerʵ�� ���󶨸�SecurityUtils
        org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);

        //3���õ�Subject�������û���/���������֤Token�����û����/ƾ֤��
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");

        try {
            //4����¼���������֤
            subject.login(token);
        } catch (AuthenticationException e) {
            //5�������֤ʧ��
        }

        Assert.assertEquals(true, subject.isAuthenticated()); //�����û��Ѿ���¼

        //6���˳�
        subject.logout();
    }

    public void loginByJdbc() {
        //1����ȡSecurityManager�������˴�ʹ��Ini�����ļ���ʼ��SecurityManager
        Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-jdbc-realm.ini");

        //2���õ�SecurityManagerʵ�� ���󶨸�SecurityUtils
        org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);

        //3���õ�Subject�������û���/���������֤Token�����û����/ƾ֤��
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");

        try {
            //4����¼���������֤
            subject.login(token);
        } catch (AuthenticationException e) {
            //5�������֤ʧ��
            e.printStackTrace();
        }

        Assert.assertEquals(true, subject.isAuthenticated()); //�����û��Ѿ���¼

        //6���˳�
        subject.logout();
    }
}
