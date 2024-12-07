package ru.rudchenko.orderservice.service;

import ru.rudchenko.orderservice.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    void deleteCustomer(Long id);
    List<Customer> getAllCustomer();
    Customer getCustomerById(Long id);
    void updateCustomer(Customer customer, Long id);

}
