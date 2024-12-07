package ru.rudchenko.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rudchenko.orderservice.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
