package com.example.greeting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepo {

    private final String message;

    public GreetingRepo(@DefaultValue("NA") @Value("${greet.message}") String message) {
        this.message = message;
    }

    public String greet() {
        return message;
    }

}
