package com.frank.grpbuying.service.impl;

import com.frank.grpbuying.common.mapper.JsonMapper;
import com.frank.grpbuying.intergration.sao.WeChatSAO;
import com.frank.grpbuying.rule.OrderRule;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl {

    static JsonMapper JSON_MAPPER = JsonMapper.nonDefaultMapper();

    @Autowired
    OrderRule orderRule;

    @Autowired
    WeChatSAO weChatSAO;

}
