package com.app.emp.controller;

import com.app.emp.domain.Order;
import com.azure.core.annotation.Post;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers/{id}/orders")
public class OrderController {
    @GetMapping
    public List<Order> getOrdersByCustomer(@PathVariable String id) {
        return null;
    }

    @PostMapping
    public Order createNewOrder(@PathVariable String id, @RequestBody Order order) {
        return null;
    }

    @PutMapping
    public Order updateOrder(@PathVariable String id, @RequestBody Order order) {
        return null;
    }

    @DeleteMapping("/{orderId}")
    public String deleteOrder(@PathVariable String id, @PathVariable String orderId) {
        return null;
    }
}
