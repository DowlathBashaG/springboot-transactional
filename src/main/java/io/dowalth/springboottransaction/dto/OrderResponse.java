package io.dowalth.springboottransaction.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderResponse {
    private String OrderTrackingNumber;
    private String status;
    private String message;
}
