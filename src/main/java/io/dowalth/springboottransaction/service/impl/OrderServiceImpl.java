package io.dowalth.springboottransaction.service.impl;

import io.dowalth.springboottransaction.dto.OrderRequest;
import io.dowalth.springboottransaction.dto.OrderResponse;
import io.dowalth.springboottransaction.entity.Order;
import io.dowalth.springboottransaction.entity.Payment;
import io.dowalth.springboottransaction.exception.PaymentException;
import io.dowalth.springboottransaction.repository.OrderRepository;
import io.dowalth.springboottransaction.repository.PaymentRespository;
import io.dowalth.springboottransaction.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private PaymentRespository paymentRespository;

    @Override
    @Transactional  // if it is failed not updated in the db.. payment type is debit will update otherwise
                    // payment type is credit it will failed and it wont update in the db.
                    // payment type is debit it will update in both tables order and payment.
    public OrderResponse placeOrder(OrderRequest orderRequest) {
        Order order = orderRequest.getOrder();
        order.setStatus("IN-PROGRESS");
        order.setOrderTrackingNumber(UUID.randomUUID().toString());
        orderRepository.save(order);

        Payment payment = orderRequest.getPayment();

        if(!payment.getType().equals("DEBIT")){
            throw new PaymentException("Payment card type do not support");
        }

        payment.setOrderId(order.getId());
        paymentRespository.save(payment);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderTrackingNumber(order.getOrderTrackingNumber());
        orderResponse.setStatus(order.getStatus());
        orderResponse.setMessage("SUCCESS");
        return orderResponse;
    }
}
