package com.frank.grpbuying.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class OrderResponseDTO extends BaseResponseDTO {
    private String orderId;
}
