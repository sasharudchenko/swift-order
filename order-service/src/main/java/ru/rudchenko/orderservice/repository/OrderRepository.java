package ru.rudchenko.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rudchenko.orderservice.model.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
