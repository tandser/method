package ru.tandser.method.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.tandser.method.dao.FibonacciDao;
import ru.tandser.method.dto.Fibonacci;
import ru.tandser.method.service.FibonacciSolver;

public class AbstractFibonacciController {

    private static final Logger logger = LoggerFactory.getLogger(AbstractFibonacciController.class);

    private FibonacciDao    fibonacciDao;
    private FibonacciSolver fibonacciSolver;

    public AbstractFibonacciController(FibonacciDao fibonacciDao, FibonacciSolver fibonacciSolver) {
        this.fibonacciDao    = fibonacciDao;
        this.fibonacciSolver = fibonacciSolver;
    }

    public Fibonacci get(Integer n) {
        Fibonacci fibonacci = fibonacciDao.get(n);

        logger.info("n = {}, fibonacci = {}", n, fibonacci);

        if (fibonacci == null || fibonacci.getVal() == null) {
            Long val = fibonacciSolver.solve(n);

            if (val != null) {
                fibonacciDao.put(fibonacci = new Fibonacci(n, val));
            }
        }

        return fibonacci;
    }
}