package com.example.demo;

import org.springframework.stereotype.Component;

@Component

public class A {
    private B b;
    public A(B b) {
        this.b = b;
        System.out.println("Khoi tao A");
    }
}
