package com.example.dockermessageservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping(value = "/messages")
    public String sendMessage() {
        return "Hello from message service!";
    }

}
