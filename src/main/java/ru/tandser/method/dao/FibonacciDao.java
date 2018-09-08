package ru.tandser.method.dao;

import ru.tandser.method.dto.Fibonacci;

public interface FibonacciDao {

    Fibonacci getVal(Integer n);

    Fibonacci getN(Long val);

    void put(Fibonacci fibonacci);
}