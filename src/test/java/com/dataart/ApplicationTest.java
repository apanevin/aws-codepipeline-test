package com.dataart;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ApplicationTest {

    @Test
    public void testTwoPlusTwoShouldBeEqualFour() {
        assertTrue(Application.plus(2, 2) == 4);
    }

    @Test
    public void testTwoPlusThreeShouldBeEqualFive() {
        assertTrue(Application.plus(2, 3) == 5);
    }
}

