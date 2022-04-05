package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoApplicationTest {

    @Test
    public void testBigNumber() {
        assertEquals("big",DemoApplication.sizeOfNumber(11));
    }

}