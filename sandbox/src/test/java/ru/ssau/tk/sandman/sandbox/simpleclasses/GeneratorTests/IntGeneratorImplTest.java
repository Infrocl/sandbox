package ru.ssau.tk.sandman.sandbox.simpleclasses.GeneratorTests;

import org.testng.annotations.Test;
import ru.ssau.tk.sandman.sandbox.simpleclasses.NumberGenerators.IntGenerator;
import ru.ssau.tk.sandman.sandbox.simpleclasses.NumberGenerators.IntGeneratorImpl;

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
