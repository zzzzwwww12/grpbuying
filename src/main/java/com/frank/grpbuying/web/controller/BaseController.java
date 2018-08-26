package com.frank.grpbuying.web.controller;

import com.frank.grpbuying.common.mapper.JsonMapper;
import com.frank.grpbuying.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;


public class BaseController {

    protected static JsonMapper JSON_MAPPER = JsonMapper.nonDefaultMapper();

    @Autowired
    protected OrderService orderService;
}
