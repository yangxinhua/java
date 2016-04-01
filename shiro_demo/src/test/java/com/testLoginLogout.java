/**
 * $Id: testLoginLogout.java,v 1.0 2016/4/17 20:25 jacky Exp $
 * <p/>
 * Copyright 2016 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package com;

import org.junit.Test;

/**
 * @author jacky
 * @version $Id: testLoginLogout.java,v 1.1 2016/4/17 20:25 jacky Exp $
 * Created on 2016/4/17 20:25
 */
public class testLoginLogout {
    @Test
    public void testLoginByIni()
    {
        LoginLogout loginLogout=new LoginLogout();
        loginLogout.loginByJdbc();
    }
}
