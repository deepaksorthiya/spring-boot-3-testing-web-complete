package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * this test is just to cover main method in test coverage
 */
@SpringBootTest(useMainMethod = SpringBootTest.UseMainMethod.ALWAYS)
class SpringBootTestingWebCompleteApplicationTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void test_main_method() {
        assertThat(applicationContext).isNotNull();
        assertNotNull(applicationContext);
    }

}
