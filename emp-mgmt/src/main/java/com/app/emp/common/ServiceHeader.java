package com.app.emp.common;

import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

public class ServiceHeader {
    Map<String, String> headers = new HashMap<>();

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public void addAttribute(String key, String value) {
        headers.put(key, value);
    }

    public String getAttribute(String key) {
        return headers.getOrDefault(key, "");
    }
}
