//Exercise 3: Assertions in JUnit

package com.mithun;

import org.junit.Test;
import static org.junit.Assert.*;

public class Exercise2 {
    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3);

        // Assert true
        assertTrue(5 > 3);

        // Assert false
        assertFalse(5 < 3);

        // Assert null
        assertNull(null);

        // Assert not null
        assertNotNull(new Object());
    }
}
