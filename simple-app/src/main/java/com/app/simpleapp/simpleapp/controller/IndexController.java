package com.app.simpleapp.simpleapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    private Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("/hello")
    public String sayHello() {
        logger.info("Fetching index page");
        return "Hello World";
    }
}
