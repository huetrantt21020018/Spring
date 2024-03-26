package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    private C c;

    @Autowired
    public B(C c) {
        this.c = c;
    }

    public C getC() {
        return c;
    }

    // Các phương thức của B
}