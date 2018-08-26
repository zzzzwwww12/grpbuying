package com.frank.grpbuying.rule;

import com.frank.grpbuying.dto.OrderRequestDTO;

public interface OrderRule {

    boolean canDirectOrder(OrderRequestDTO request);
}
