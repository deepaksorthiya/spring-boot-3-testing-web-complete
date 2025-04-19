package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final String message;

    public HomeController(@DefaultValue("NA") @Value("${hello.message}") String message) {
        this.message = message;
    }

    @RequestMapping("/")
    public String greeting() {
        return message;
    }

}
