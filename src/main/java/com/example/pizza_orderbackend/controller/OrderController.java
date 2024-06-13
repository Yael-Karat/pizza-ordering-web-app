package com.example.pizza_orderbackend.controller;

import com.example.pizza_orderbackend.model.Order;
import com.example.pizza_orderbackend.service.OrderService;
import org.springframework.web.bind.annotation.*;

/**
 * OrderController class handles the HTTP requests related to orders.
 */
@RestController
@RequestMapping("/api")
public class OrderController {
    private final OrderService orderService;

    /**
     * Constructor to initialize OrderService.
     *
     * @param orderService the service handling order logic.
     */
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    /**
     * Places a new order.
     *
     * @param order the order to be placed.
     * @return the order code generated.
     */
    @PostMapping("/orders")
    public String placeOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    /**
     * Retrieves an order by its code.
     *
     * @param code the code of the order.
     * @return the order details.
     */
    @GetMapping("/orders/{code}")
    public Order getOrder(@PathVariable String code) {
        return orderService.getOrder(code);
    }
}
