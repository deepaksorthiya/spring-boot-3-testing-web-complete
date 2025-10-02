package com.example.home;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    private final String message;

    public HomeController(@DefaultValue("NA") @Value("${home.message}") String message) {
        this.message = message;
    }

    @GetMapping
    public ResponseEntity<String> message() {
        return ResponseEntity.ok(message);
    }

}
