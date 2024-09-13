package com.xpain.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Allow React app to access this API
public class HelloController {

    @GetMapping("/api/hello")
    public String sayHello() {
        return "Hello";
    }
}
