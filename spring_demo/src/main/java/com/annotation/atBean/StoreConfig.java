package com.annotation.atBean;

import com.annotation.atBean.impl.StoreImpl;
import com.annotation.atBean.interfaces.IStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jacky on 2016/1/26.
 */
@Configuration
public class StoreConfig {
    @Bean(name="storeImpl",initMethod = "init" ,destroyMethod = "destroy")
    public IStore getStoreImpl()
    {
        return new StoreImpl();
    }
}
