package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class C {
    public C() {
        System.out.println("Khoi tao C");
    }

    public void use() {
        System.out.println("Call to C");
    }
}
