package org.ag.springboot.thingy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddUpTest {

    @Test
    void addTwoNumbers() {
        assertEquals("2 + 3 = 5", new AddUp().addTwoNumbers(2, 3));
    }
}