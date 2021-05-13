package com.example.dockerproductservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


    @GetMapping(value = "/products")
    public String getProductName() {
        return "A brand new product has been released!";
    }
}
