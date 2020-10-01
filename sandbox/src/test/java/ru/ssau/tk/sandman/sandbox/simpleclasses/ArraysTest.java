package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraysTest {
    @Test
    public void testGetNewDSizeIntArray() {
        int[] numbers = Arrays.getNewSizeIntArray(5);
        int[] empty = Arrays.getNewSizeIntArray(0);
        assertEquals(numbers[2], 0);
        assertEquals(numbers.length, 5);
        assertEquals(empty.length, 0);
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

    @Test
    public void testGetOddNumbersArray() {
        int[] empty = Arrays.getOddNumbersArray(0);
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

    @Test
    public void testGetFibonacciNumbersArray() {
        int[] numbers = Arrays.getFibonacciNumbersArray(7);
        assertEquals(numbers[6], 8);
        assertEquals(numbers[0], 0);
        assertEquals(numbers[3], 2);
        assertNotEquals(numbers[4], 4);
    }

    @Test
    public void testGetArrayOfSqrIndexes() {
        double[] empty = Arrays.getArrayOfSqrIndexes(0);
        assertEquals(empty.length, 0);
        double[] numbers = Arrays.getArrayOfSqrIndexes(5);
        assertEquals(numbers[0], 0.0);
        assertEquals(numbers[4], 16.0);
        assertEquals(numbers[3], 9.0);
        assertNotEquals(numbers[2], 2.0);
        assertNotEquals(numbers[2], 4);
    }

    @Test
    public void testGetNewSizeDoubleArray() {
        double[] numbers = Arrays.getNewSizeDoubleArray(5);
        double[] empty = Arrays.getNewSizeDoubleArray(0);
        assertEquals(numbers[2], 0.0);
        assertEquals(numbers.length, 5);
        assertEquals(empty.length, 0);
    }
}