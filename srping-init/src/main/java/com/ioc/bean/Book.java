/**
 * $Id: Book.java,v 1.0 2016/8/21 15:52 jacky Exp $
 * <p/>
 * Copyright 2016 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package com.ioc.bean;

/**
 * @author jacky
 * @version $Id: Book.java,v 1.1 2016/8/21 15:52 jacky Exp $
 * Created on 2016/8/21 15:52
 */
public class Book {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private int id;
}
