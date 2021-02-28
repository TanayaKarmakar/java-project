package com.app.simpleapp.simpleapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
}
