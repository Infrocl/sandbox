package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntGeneratorImplTest {
    @Test
    public void testNextInt() {
        IntGenerator generator = new IntGeneratorImpl();
        assertEquals(generator.nextInt(), 0);
        assertEquals(generator.nextInt(), 1);
        assertEquals(generator.nextInt(), 2);
    }
}
