package com.example;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestPropertySource(properties = {"spring.profiles.active=test"})
class GreetingService2Tests extends AbstractBaseTest {

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
        assertEquals("test message", greetingService.greet());
        //verify(greetingRepo, times(1)).greet();
    }

}
