package ru.tandser.method.web.controller;

import ru.tandser.method.dao.FibonacciDao;
import ru.tandser.method.dto.Fibonacci;
import ru.tandser.method.service.FibonacciSolver;

public class AbstractFibonacciController {

    private FibonacciDao    fibonacciDao;
    private FibonacciSolver fibonacciSolver;

    public AbstractFibonacciController(FibonacciDao fibonacciDao, FibonacciSolver fibonacciSolver) {
        this.fibonacciDao    = fibonacciDao;
        this.fibonacciSolver = fibonacciSolver;
    }

    public Fibonacci getVal(Integer n) {
        Fibonacci fibonacci = fibonacciDao.getVal(n);

        if (fibonacci == null || fibonacci.getVal() == null) {
            Long val = fibonacciSolver.solve(n);

            if (val != null) {
                fibonacciDao.put(fibonacci = new Fibonacci(n, val));
            }
        }

        return fibonacci;
    }

    public Fibonacci getN(Long val) {
        return fibonacciDao.getN(val);
    }
}