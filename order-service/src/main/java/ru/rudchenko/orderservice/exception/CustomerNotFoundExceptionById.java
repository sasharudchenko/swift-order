package ru.rudchenko.orderservice.exception;

public class CustomerNotFoundExceptionById extends RuntimeException {
    public CustomerNotFoundExceptionById(String massage) {
        super(massage);
    }
}
