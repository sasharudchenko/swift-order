package ru.rudchenko.orderservice.service;

import org.springframework.stereotype.Service;
import ru.rudchenko.orderservice.exception.CustomerNotFoundExceptionById;
import ru.rudchenko.orderservice.model.Customer;
import ru.rudchenko.orderservice.repository.CustomerRepository;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }


    @Override
    public Customer getCustomerById(Long id) {
        Customer customer = customerRepository
                .findById(id)
                .orElseThrow(()-> new CustomerNotFoundExceptionById
                        ("Клиент с id" + id + " не найден"));
        return customer;
    }

    @Override
    public void updateCustomer(Customer customer, Long id) {

    }
}
