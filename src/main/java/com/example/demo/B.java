package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class B {
    C c;
    public B(C c) {
        this.c = c;
        System.out.println("Khoi tao B");
    }

    public C getC() {
        return c;
    }
}
