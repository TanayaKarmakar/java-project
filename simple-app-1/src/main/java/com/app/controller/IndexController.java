package com.app.controller;

import com.microsoft.applicationinsights.TelemetryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class IndexController {
    @Autowired
    private TelemetryClient telemetryClient;

    @GetMapping("/index")
    public String index() {
        telemetryClient.trackEvent("URI /inddx is triggered - v1");
        return "This is application version V1";
    }
}
