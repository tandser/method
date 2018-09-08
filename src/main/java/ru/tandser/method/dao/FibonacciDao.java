package ru.tandser.method.dao;

import ru.tandser.method.dto.Fibonacci;

public interface FibonacciDao {

    Fibonacci get(Integer n);

    void put(Fibonacci fibonacci);
}