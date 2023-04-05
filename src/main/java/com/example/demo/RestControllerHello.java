package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class RestControllerHello {

    @GetMapping("/hello")
    String getHello() {
        return "hello " + LocalDateTime.now();
    }

}
