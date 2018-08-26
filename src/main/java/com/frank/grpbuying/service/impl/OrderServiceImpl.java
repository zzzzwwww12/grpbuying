package com.frank.grpbuying.service.impl;

import com.frank.grpbuying.dto.OrderRequestDTO;
import com.frank.grpbuying.dto.OrderResponseDTO;
import com.frank.grpbuying.exception.OrderException;
import com.frank.grpbuying.intergration.dto.WeChatOrderRequestDTO;
import com.frank.grpbuying.intergration.dto.WeChatOrderResponseDTO;
import com.frank.grpbuying.model.GrpDirectOrder;
import com.frank.grpbuying.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import reactor.core.publisher.Mono;

@Service
public class OrderServiceImpl extends BaseServiceImpl implements OrderService {

    @Override
    public Mono<OrderResponseDTO> order(OrderRequestDTO request) throws OrderException {

        if (!orderRule.canDirectOrder(request)) {
            return Mono.just(OrderResponseDTO.builder().orderId("This is a test").build());
        }

        //通过验证逻辑，开始生成微信下单请求
        WeChatOrderRequestDTO weChatOrderRequestDTO = JSON_MAPPER.fromJson(JSON_MAPPER.toJson(request), WeChatOrderRequestDTO.class);
        completeRequest(weChatOrderRequestDTO);

        String response = weChatSAO.order(weChatOrderRequestDTO);
        if (StringUtils.isEmpty(response)) throw new OrderException();

        WeChatOrderResponseDTO weChatOrderResponseDTO = JSON_MAPPER.fromJson(response, WeChatOrderResponseDTO.class);

        GrpDirectOrder grpDirectOrder = completeDirectOrder(request, weChatOrderResponseDTO);

        return Mono.empty();
    }

    private GrpDirectOrder completeDirectOrder(OrderRequestDTO request, WeChatOrderResponseDTO weChatOrderResponseDTO) {
        return null;
    }

    private void completeRequest(WeChatOrderRequestDTO weChatOrderRequestDTO) {

    }

    @Override
    public Mono<OrderResponseDTO> getOrder(String id) {
        return null;
    }
}
