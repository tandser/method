package ru.tandser.method.dto;

import com.google.common.base.MoreObjects;

public class Fibonacci {

    private Integer n;
    private Long    val;

    public Fibonacci() {}

    public Fibonacci(Integer n, Long val) {
        this.n   = n;
        this.val = val;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("n",   n)
                .add("val", val)
                .toString();
    }

    /* Setters and Getters */

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public Long getVal() {
        return val;
    }

    public void setVal(Long val) {
        this.val = val;
    }
}