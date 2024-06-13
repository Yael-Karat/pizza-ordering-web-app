package com.example.pizza_orderbackend.service;

import com.example.pizza_orderbackend.model.Order;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * OrderService class handles the logic for saving and retrieving orders.
 */
@Service
public class OrderService {
    private final Map<String, Order> orders = new HashMap<>();

    /**
     * Saves the given order and generates a unique order code.
     *
     * @param order the order to be saved.
     * @return the generated order code.
     */
    public String saveOrder(Order order) {
        String code = UUID.randomUUID().toString();
        order.setCode(code);
        orders.put(code, order);
        return code;
    }

    /**
     * Retrieves an order by its code.
     *
     * @param code the code of the order to be retrieved.
     * @return the order with the given code.
     */
    public Order getOrder(String code) {
        return orders.get(code);
    }
}
