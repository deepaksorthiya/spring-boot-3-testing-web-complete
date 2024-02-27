package com.example;

import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class GreetingServiceTests {

    @InjectMocks
    private GreetingService greetingService;

    @Mock
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
        assertEquals("Hello, World", greetingService.greet());
        verify(greetingRepo, times(1)).greet();
    }

}
