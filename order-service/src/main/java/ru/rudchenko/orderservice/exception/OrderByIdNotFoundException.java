package ru.rudchenko.orderservice.exception;

import ru.rudchenko.orderservice.model.Order;

public class OrderByIdNotFoundException extends RuntimeException {
    public OrderByIdNotFoundException(String message) {
        super(message);
    }
}
