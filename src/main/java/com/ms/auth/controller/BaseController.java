package com.ms.auth.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BaseController {

    @Value("${cloud.config:}")
    String cloudConfig;

    public BaseController(@Value("${cloud.config.id:}") String cloudConfigId) {
        System.out.println("cloudConfigId : " + cloudConfigId);
    }

    @GetMapping("")
    public String profiles() {
        return cloudConfig;
    }
}