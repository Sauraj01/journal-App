package com.journal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthCheck {
   @GetMapping("/check")
   public String HealthCheck(){
        return "Ok";
    }
}
