package com.example.it;

import com.example.AbstractBaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.assertj.MockMvcTester;
import org.springframework.test.web.servlet.assertj.MvcTestResult;

import static org.assertj.core.api.Assertions.assertThat;

@AutoConfigureMockMvc
class SpringBoot3MockMvcTesterIT extends AbstractBaseTest {

    @Autowired
    MockMvcTester mockMvcTester;


    @Test
    void shouldReturnDefaultMessage() throws Exception {
        MvcTestResult testResult = mockMvcTester
                .get()
                .uri("/")
                .accept(MediaType.APPLICATION_JSON)
                .exchange();

        assertThat(testResult)
                .hasStatus(HttpStatus.OK)
                .hasContentType(MediaType.APPLICATION_JSON)
                .bodyJson()
                .convertTo(String.class)
                .isEqualTo("default hello message");
    }
}