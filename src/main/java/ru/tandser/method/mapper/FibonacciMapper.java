package ru.tandser.method.mapper;

import org.apache.ibatis.annotations.Mapper;
import ru.tandser.method.dto.Fibonacci;

@Mapper
public interface FibonacciMapper {

    Fibonacci getVal(Integer n);
    
    Fibonacci getN(Long val);
    
    void put(Fibonacci fibonacci);
}