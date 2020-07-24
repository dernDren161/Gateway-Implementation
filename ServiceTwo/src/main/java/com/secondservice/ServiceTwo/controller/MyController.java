package com.secondservice.ServiceTwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceTwo")
public class MyController {

    @GetMapping("/two")
    public String serviceName(){

        return "I am Second Service, Hello";
    }
}
