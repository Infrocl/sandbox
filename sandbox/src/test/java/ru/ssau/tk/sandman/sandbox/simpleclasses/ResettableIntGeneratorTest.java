package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ResettableIntGeneratorTest {
    @Test
    public void testNextInt() {
        ResettableIntGenerator generator = new ResettableIntGenerator();
        assertEquals(generator.nextInt(), 0);
        assertEquals(generator.nextInt(), 1);
    }

    @Test
    public void testReset() {
        ResettableIntGenerator generator = new ResettableIntGenerator();
        int count = generator
                .nextInt(); //если бы возвращался объект типа генератора, можно было бы применить
        generator.nextInt();  //метод ещё раз
        generator.reset();
        assertEquals(generator.nextInt(), 0);
    }
}
