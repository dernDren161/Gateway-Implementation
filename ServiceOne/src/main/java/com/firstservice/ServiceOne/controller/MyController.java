package com.firstservice.ServiceOne.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceOne")
public class MyController {

    @GetMapping("/one")
    public String serviceName(){
        return "I am Service One, Hello";
    }
}
