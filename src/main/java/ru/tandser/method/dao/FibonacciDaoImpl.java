package ru.tandser.method.dao;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import ru.tandser.method.dto.Fibonacci;
import ru.tandser.method.mapper.FibonacciMapper;

@Repository
public class FibonacciDaoImpl implements FibonacciDao {

    private FibonacciMapper fibonacciMapper;

    public FibonacciDaoImpl(FibonacciMapper fibonacciMapper) {
        this.fibonacciMapper = fibonacciMapper;
    }

    @Override
    public Fibonacci get(Integer n) {
        return fibonacciMapper.get(n);
    }

    @Override
    public void put(Fibonacci fibonacci) {
        fibonacciMapper.put(fibonacci);
    }
}