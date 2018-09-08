package ru.tandser.method.mapper;

import org.apache.ibatis.annotations.Mapper;
import ru.tandser.method.dto.Fibonacci;

@Mapper
public interface FibonacciMapper {

    Fibonacci get(Integer n);

    void put(Fibonacci fibonacci);
}