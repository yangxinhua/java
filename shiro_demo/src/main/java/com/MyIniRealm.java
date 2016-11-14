/**
 * $Id: MyRealm1.java,v 1.0 2016/4/17 20:36 jacky Exp $
 * <p/>
 * Copyright 2016 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package com;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * @author jacky
 * @version $Id: MyRealm1.java,v 1.1 2016/4/17 20:36 jacky Exp $
 * Created on 2016/4/17 20:36
 */
public class MyIniRealm implements Realm {
    public String getName() {
        return "MyIniRealm";
    }

    public boolean supports(AuthenticationToken token) {
        return token instanceof UsernamePasswordToken;
    }

    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String)token.getPrincipal();  //�õ��û���
        String password = new String((char[])token.getCredentials()); //�õ�����
        if(!"zhang".equals(username)) {
            throw new UnknownAccountException(); //����û�������
        }
        if(!"123".equals(password)) {
            throw new IncorrectCredentialsException(); //����������
        }
        //��������֤��֤�ɹ�������һ��AuthenticationInfoʵ�֣�
        return new SimpleAuthenticationInfo(username, password, getName());
    }
}
