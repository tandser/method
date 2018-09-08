package ru.tandser.method.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.*;
import ru.tandser.method.dao.FibonacciDao;
import ru.tandser.method.dto.Fibonacci;
import ru.tandser.method.service.FibonacciSolver;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(RestFibonacciController.root_path)
public class RestFibonacciController extends AbstractFibonacciController {

    private static final Logger logger = LoggerFactory.getLogger(RestFibonacciController.class);

    static final String root_path = "/fibonacci";

    public RestFibonacciController(@Autowired FibonacciDao fibonacciDao, @Autowired FibonacciSolver fibonacciSolver) {
        super(fibonacciDao, fibonacciSolver);
    }

    @Override
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public Fibonacci get(@RequestParam Integer n) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Fibonacci result = super.get(n);
        stopWatch.stop();
        logger.info("duration = {} ms", stopWatch.getTotalTimeMillis());
        return result;
    }
}