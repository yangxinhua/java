package com.ioc.di.setter.bean;
import com.ioc.di.setter.bean.FilmBean;

/**
 * Created by jacky on 2016/3/31.
 */
public class ViewerBean {
    private com.ioc.di.setter.bean.FilmBean filmBean;
    public void setFilmBean(com.ioc.di.setter.bean.FilmBean filmBean) {
        this.filmBean = filmBean;
        System.out.println("ViewerBean:filename="+filmBean.getFilename());
    }
}
