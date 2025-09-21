package com.example.greeting;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    private final GreetingService service;

    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @RequestMapping("/greeting")
    public ResponseEntity<String> greeting() {
        String greet = service.greet();
        return ResponseEntity.ok(greet);
    }

}
