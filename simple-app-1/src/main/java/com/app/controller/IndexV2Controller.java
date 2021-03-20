package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class IndexV2Controller {
    @GetMapping("/index")
    public String index() {
        return "This is application version V2";
    }
}
