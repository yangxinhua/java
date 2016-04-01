/**
 * $Id: Reader.java,v 1.0 2016/8/21 15:51 jacky Exp $
 * <p/>
 * Copyright 2016 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package com.ioc.bean;

/**
 * @author jacky
 * @version $Id: Reader.java,v 1.1 2016/8/21 15:51 jacky Exp $
 * Created on 2016/8/21 15:51
 */
public class Reader {
    public Reader(Book book)
    {
        System.out.printf("bookname="+book.getName()+";bookid="+book.getId());
    }
}
