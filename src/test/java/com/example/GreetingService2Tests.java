package com.example;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GreetingService2Tests {

    @Autowired
    private GreetingService greetingService;

    //@MockitoBean
    //private GreetingRepo greetingRepo;

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
        //when(greetingRepo.greet()).thenReturn("Hello, World");
        //assertEquals("Hello, World", greetingService.greet());
        assertEquals("Hello World From Test", greetingService.greet());
        //verify(greetingRepo, times(1)).greet();
    }

}
