package com.example.taskmanager.adapter.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/health")
public class HealthCheck {
    @GetMapping
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    void healthCheck() {
        log.info("Health check");
    }
}
