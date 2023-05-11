package com.example.Ex22;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Value("${welcomeMsg}")
    private String welcomeMsg;

    @GetMapping("/welcome")
    public String welcome() {
        return welcomeMsg;
    }

}