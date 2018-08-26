package com.frank.grpbuying.web.controller;

import com.frank.grpbuying.dto.OrderRequestDTO;
import com.frank.grpbuying.dto.OrderResponseDTO;
import com.frank.grpbuying.exception.OrderException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class OrderController extends BaseController {

    @PostMapping("/order")
    public Mono<OrderResponseDTO> order(OrderRequestDTO request) throws OrderException {
        return orderService.order(request);
    }

    @PostMapping("/order/{id}")
    public Mono<OrderResponseDTO> getOrder(@PathVariable String id) {
        return orderService.getOrder(id);
    }

}
