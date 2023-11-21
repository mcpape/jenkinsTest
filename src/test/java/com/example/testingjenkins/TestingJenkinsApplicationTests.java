package com.example.testingjenkins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestingJenkinsApplicationTests {

    @Test
    void testThatTrue() {
        assertEquals(1, 1);
    }
}
