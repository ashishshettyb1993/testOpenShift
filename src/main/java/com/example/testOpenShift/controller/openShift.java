package com.example.testOpenShift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class openShift {

    @GetMapping("/check")
    public String test(){
        return "Open Shift test";
    }
}
