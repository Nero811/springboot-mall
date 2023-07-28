package com.jackyang.springbootmall.service;

import com.jackyang.springbootmall.dto.CreateOrderRequest;
import com.jackyang.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer OrderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
