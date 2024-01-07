package dev.lebenkov.orderservice.service;

import dev.lebenkov.orderservice.dto.OrderRequest;

public interface OrderService {
    String placeOrder(OrderRequest orderRequest);
}
