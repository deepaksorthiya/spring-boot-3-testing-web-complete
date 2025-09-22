package com.example;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@TestPropertySource(properties = {"spring.profiles.active=test"})
class GreetingService3Tests extends AbstractBaseTest {

    @Autowired
    private GreetingService greetingService;

    @MockitoBean
    private GreetingRepo greetingRepo;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testGreet() {
        when(greetingRepo.greet()).thenReturn("Hello, World");
        String greet = greetingService.greet();
        assertEquals("Hello, World", greet);
        verify(greetingRepo, times(1)).greet();
    }

}
