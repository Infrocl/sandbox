package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraysTest {

    @Test
    public void testGetNewDimensionArray() {
        int[] numbers = Arrays.getNewDimensionArray(0); //пустой массив
        int[] aLotOfNumbers = Arrays.getNewDimensionArray(5);
        assertEquals(aLotOfNumbers[2], 0);
        assertEquals(aLotOfNumbers.length, 5);
        assertEquals(numbers.length, 0);
    }

    @Test
    public void testGetOnesAndTwosArray() {
        int[] numbers = Arrays.getOnesAndTwosArray(5);
        assertEquals(numbers[0], 2);
        assertEquals(numbers[4], 2);
        assertNotEquals(numbers[1], 0);
        assertNotEquals(numbers[2], 0);
        assertNotEquals(numbers[3], 0);
    }
}