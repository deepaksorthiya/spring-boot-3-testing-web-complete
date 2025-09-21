package com.example.home.it;

import com.example.AbstractIntegrationTestBase;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

class HomeControllerIT extends AbstractIntegrationTestBase {

    @Test
    void message_should_return_status_ok_and_home_message() {
        ResponseEntity<String> hello = testRestTemplate.getForEntity("/",
                String.class);
        assertThat(hello.getBody
                ()).isEqualTo("default hello message");
        assertThat(hello.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
