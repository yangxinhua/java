package com.ioc.di.constructor.bean;

/**
 * Created by jacky on 2016/3/31.
 */
public class FilmBean {
    public String getFilename() {
        return filename;
    }

    private String filename;

    public FilmBean(String filename) {
        this.filename = filename;
        System.out.println("FilmBean:filename="+filename);
    }
}
