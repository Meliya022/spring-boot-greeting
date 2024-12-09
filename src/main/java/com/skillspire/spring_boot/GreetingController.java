package com.skillspire.spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greet")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/name")
    public String helloMeliya() {
        return "Hello, Meliya!";
    }

    @GetMapping("/speak")
    public String speak() {
        return "I am fine";
    }
}
