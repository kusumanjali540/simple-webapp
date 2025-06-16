package com.example.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "<h1 style='color: blue;'>Hello from Spring Boot Web App with Blue Color!</h1>";
    }
}
