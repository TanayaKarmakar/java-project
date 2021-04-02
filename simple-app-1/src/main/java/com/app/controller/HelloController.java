package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/hello")
    public String hello() {
        ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();

        String key = "greeting";
        if(!this.stringRedisTemplate.hasKey(key)) {
            ops.set(key, "Hello World!");
        }
        return ops.get(key);
    }
}
