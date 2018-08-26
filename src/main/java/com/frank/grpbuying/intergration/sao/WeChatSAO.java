package com.frank.grpbuying.intergration.sao;

import com.frank.grpbuying.intergration.dto.WeChatOrderRequestDTO;

public interface WeChatSAO {
    String order(WeChatOrderRequestDTO weChatOrderRequestDTO);
}
