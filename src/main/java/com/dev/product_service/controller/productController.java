package com.dev.product_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
