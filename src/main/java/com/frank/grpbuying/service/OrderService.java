package com.frank.grpbuying.service;

import com.frank.grpbuying.dto.OrderRequestDTO;
import com.frank.grpbuying.dto.OrderResponseDTO;
import com.frank.grpbuying.exception.OrderException;
import reactor.core.publisher.Mono;

public interface OrderService {
    Mono<OrderResponseDTO> order(OrderRequestDTO request) throws OrderException;

    Mono<OrderResponseDTO> getOrder(String id);
}
