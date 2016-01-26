package com.annotation.atBean;

import com.annotation.JdbcDriverManager;
import com.annotation.atBean.impl.StoreImpl;
import com.annotation.atBean.interfaces.IStore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by jacky on 2016/1/26.
 */
@Configuration
@ImportResource("classpath*:spring-annotation.xml")
public class StoreConfig {
    @Value("${jdbc.username}")
    private  String username;

    @Value("${jdbc.password}")
    private  String password;

    @Value("${jdbc.url}")
    private  String url;

//    @Bean(name="storeImpl",initMethod = "init" ,destroyMethod = "destroy")
//    public IStore getStoreImpl()
//    {
//        return new StoreImpl();
//    }

    @Bean(name="jdbcdrivermanager")
    public JdbcDriverManager getJdbcDriverManager()
    {
        return new JdbcDriverManager(username,password,url);
    }
}
