package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraysTest {
    @Test
    public void testGetNewDimensionArray() {
        int[] numbers = Arrays.getNewDimensionArray(5);
        int[] zeroNumbers = Arrays.getNewDimensionArray(0);
        assertEquals(numbers[2], 0);
        assertEquals(numbers.length, 5);
        assertEquals(zeroNumbers.length, 0);
    }

    @Test
    public void testGetOnesAndTwosArray() {
        int[] numbers = Arrays.getOnesAndTwosArray(5);
        assertEquals(numbers[0], 2);
        assertEquals(numbers[4], 2);
        assertNotEquals(numbers[1], 0);
        assertNotEquals(numbers[2], 0);
        assertNotEquals(numbers[3], 0);
        //int[] num = Arrays.getOnesAndTwosArray(0); ---> ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
    }

    @Test
    public void testGetOddNumbersArray() {
        int[] numbers = Arrays.getOddNumbersArray(5);
        assertEquals(numbers[2], 5);
        assertEquals(numbers[3], 7);
        assertEquals(numbers[1], 3);
        assertNotEquals(numbers[0], 0);
        assertNotEquals(numbers[4], 0);
    }

    @Test
    public void testGetReversedEvenNumbersArray() {
        int[] numbers = Arrays.getReversedEvenNumbersArray(5);
        assertEquals(numbers[0], 10);
        assertEquals(numbers[4], 2);
        assertNotEquals(numbers[1], 9);
        assertEquals(numbers[2], 6);
    }
}