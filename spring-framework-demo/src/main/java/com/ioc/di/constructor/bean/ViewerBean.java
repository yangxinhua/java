package com.ioc.di.constructor.bean;

/**
 * Created by jacky on 2016/3/31.
 */
public class ViewerBean {
    private FilmBean filmBean;
    public ViewerBean(FilmBean filmBean) {
        this.filmBean=filmBean;
        System.out.println("ViewerBean:filename="+filmBean.getFilename());
    }
}
