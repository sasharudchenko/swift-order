package ru.rudchenko.orderservice.service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.rudchenko.orderservice.exception.OrderByIdNotFoundException;
import ru.rudchenko.orderservice.model.Order;
import ru.rudchenko.orderservice.repository.OrderRepository;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Transactional
    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public List<Order> getAllOrder() {
        List<Order> orders = orderRepository.findAll();
        return orders;
    }

    @Override
    public Order getOrderById(Long id) {
        Order order = orderRepository.findById(id).orElseThrow(() ->
                new OrderByIdNotFoundException("Заказа с " + id + " не существует"));
        return order;
    }

    @Override
    public void updateOrder(Order order, Long id) {
        Order newOrder = order;

    }
}
