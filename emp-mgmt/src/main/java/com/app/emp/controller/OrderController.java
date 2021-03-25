package com.app.emp.controller;

import com.app.emp.entity.OrderEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers/{id}/orders")
public class OrderController {
    @GetMapping
    public List<OrderEntity> getOrdersByCustomer(@PathVariable String id) {
        return null;
    }

    @PostMapping
    public OrderEntity createNewOrder(@PathVariable String id, @RequestBody OrderEntity order) {
        return null;
    }

    @PutMapping
    public OrderEntity updateOrder(@PathVariable String id, @RequestBody OrderEntity order) {
        return null;
    }

    @DeleteMapping("/{orderId}")
    public String deleteOrder(@PathVariable String id, @PathVariable String orderId) {
        return null;
    }
}
