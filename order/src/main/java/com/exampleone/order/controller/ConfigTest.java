package com.exampleone.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigTest {
    @Value("${env}")
    private String env;

    @GetMapping("/print2")
    public String print(){
        return env;
    }
}
