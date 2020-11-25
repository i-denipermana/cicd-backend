package com.cicd.backend.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHelloTo(String name) {
        return String.format("Hello %s", name);
    }

    public String welcomeMessage() {
        return "Welcome";
    }
}
