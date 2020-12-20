package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${name}")
    private String name;

    @GetMapping("/")
    public String index() {
        return "Hello from Spring Boot! " + this.name;
    }
}
