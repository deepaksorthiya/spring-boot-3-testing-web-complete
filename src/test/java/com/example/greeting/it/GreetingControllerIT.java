package com.example.greeting.it;

import com.example.AbstractIntegrationTestBase;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

class GreetingControllerIT extends AbstractIntegrationTestBase {

    @Test
    void greeting_should_return_greet_message_from_test_profile() {
        ResponseEntity<String> greeting = testRestTemplate.getForEntity("/greeting",
                String.class);
        assertThat(greeting.getBody()).contains("test greet message");
        assertThat(greeting.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
