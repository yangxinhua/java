package com.annotation.services.impl;

import com.annotation.services.interfaces.IBeanMultiService;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by jacky on 2016/1/21.
 */
@Component
@Order(1)
public class BeanMutilServiceImplTwo implements IBeanMultiService {
}
