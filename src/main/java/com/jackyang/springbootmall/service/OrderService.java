package com.jackyang.springbootmall.service;

import com.jackyang.springbootmall.dto.CreateOrderRequest;
import com.jackyang.springbootmall.dto.OrderQueryParams;
import com.jackyang.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer OrderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
