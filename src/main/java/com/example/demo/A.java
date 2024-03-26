package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    private B b;

    @Autowired
    public A(B b) {
        this.b = b;
    }

    // Các phương thức của A
    @PostConstruct
    void test() {
        b.getC().test();
    }
}
