package com.example.localstoredatabase.service;

import com.example.localstoredatabase.dto.OrderDTO;
import com.example.localstoredatabase.entity.Customer;
import com.example.localstoredatabase.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderImpl implements Order {
    private final OrderRepository orderRepository;

    @Autowired 
    public OrderImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Override
    public Customer createOrder(OrderDTO orderDto) {
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public Order getOrderById(Long orderId) {
        return null;
    }

    @Override
    public Order updateOrder(Long orderId, OrderDTO orderDto) {
        return null;
    }

    @Override
    public void deleteOrder(Long orderId) {

    }
}
