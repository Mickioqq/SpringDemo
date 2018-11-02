package com.wqq.spring.controller.spring_aop.after;

import org.springframework.stereotype.Component;

@Component("arithmetiCalculator")
public class ArithmetiCalculatorImpl implements ArithmetiCalculator {
    @Override
    public int Add(int a, int b) {
        return a+b;
    }

    @Override
    public int Sub(int a, int b) {
        return a-b;
    }
}
