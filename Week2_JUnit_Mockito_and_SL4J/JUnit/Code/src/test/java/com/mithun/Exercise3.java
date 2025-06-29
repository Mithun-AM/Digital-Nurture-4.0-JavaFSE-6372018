// Exercise 4: Arrange-Act-Assert (AAA) Pattern, Test Fixtures, Setup and
// Teardown Methods in JUnit

package com.mithun;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise3 {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange
        calculator = new Calculator();
        System.out.println("Setup: Calculator instance created.");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator instance cleared.");
    }

    @Test
    public void testAddition() {
        // Act
        int result = calculator.add(10, 5);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testAdditionWithZero() {
        int result = calculator.add(0, 7);
        assertEquals(7, result);
    }
}
