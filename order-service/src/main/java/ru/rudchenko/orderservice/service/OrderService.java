package ru.rudchenko.orderservice.service;

import org.springframework.stereotype.Service;
import ru.rudchenko.orderservice.model.Order;

import java.util.List;
@Service
public interface OrderService {
    Order saveOrder(Order order);
    void deleteOrder(Long id);
    List<Order> getAllOrder();
    Order getOrderById(Long id);
    void updateOrder(Order order, Long id);
}
