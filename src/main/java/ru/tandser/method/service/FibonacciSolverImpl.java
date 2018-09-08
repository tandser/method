package ru.tandser.method.service;

import org.springframework.cache.annotation.Cacheable;

public class FibonacciSolverImpl implements FibonacciSolver {

    @Override
    @Cacheable("fibonacciSolve")
    public Long solve(Integer n) {
        long x = 1;
        long y = 0;

        for (int i = 1; i <= n; i++) {
            x += y;
            y = x - y;
        }

        return y;
    }
}