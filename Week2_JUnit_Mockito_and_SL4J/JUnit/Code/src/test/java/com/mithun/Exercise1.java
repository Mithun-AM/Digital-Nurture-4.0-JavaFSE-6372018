//Exercise 1: Setting Up JUnit

package com.mithun;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise1 {
    @Test
    public void testAdd1() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testAdd2() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.add(7, 3));
    }

    @Test
    public void testAdd3() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.add(-2, 3));
    }
}
