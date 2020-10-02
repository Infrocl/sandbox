package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraysTest {
    final private double ACCURACY = 0.0005;

    @Test
    public void testGetNewSizeIntArray() {
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

    @Test
    public void testSolveQuadraticEquation() {
        double[] firstEquation = Arrays.solveQuadraticEquation(0.0005, 2, 5);
        assertEquals(firstEquation[0], -3997.4984, ACCURACY);
        assertEquals(firstEquation[1], -2.50156, ACCURACY);
        assertEquals(firstEquation.length, 2);
        double[] secondEquation = Arrays.solveQuadraticEquation(0, -3, -9);
        assertEquals(secondEquation.length, 1);
        assertEquals(secondEquation[0], -3, ACCURACY);
        double[] thirdEquation = Arrays.solveQuadraticEquation(1, 2, 16);
        assertEquals(thirdEquation.length, 0);
    }
}