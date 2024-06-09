package com.example.pizza_orderbackend.service;

import com.example.pizza_orderbackend.model.Order;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private final Map<String, Order> orders = new HashMap<>();

    public List<Order> getAllOrders() {
        return orders.values().stream().collect(Collectors.toList());
    }

    public Order getOrderById(String code) {
        return orders.get(code);
    }

    public Order saveOrder(Order order) {
        String code = generateUniqueCode();
        order.setCode(code);
        orders.put(code, order);
        return order;
    }

    private String generateUniqueCode() {
        return UUID.randomUUID().toString();
    }
}
