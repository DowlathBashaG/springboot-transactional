package io.dowalth.springboottransaction.dto;

import io.dowalth.springboottransaction.entity.Order;
import io.dowalth.springboottransaction.entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;

}
