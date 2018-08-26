package com.frank.grpbuying.rule.impl;

import com.frank.grpbuying.dto.OrderRequestDTO;
import com.frank.grpbuying.rule.OrderRule;
import org.springframework.stereotype.Service;

@Service
public class OrderRuleImpl implements OrderRule {

    @Override
    public boolean canDirectOrder(OrderRequestDTO request) {
        return false;
    }
}
