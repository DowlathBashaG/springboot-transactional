package io.dowalth.springboottransaction.service;

import io.dowalth.springboottransaction.dto.OrderRequest;
import io.dowalth.springboottransaction.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}
