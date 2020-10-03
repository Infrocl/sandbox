package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraysTest {
    final private double ACCURACY = 0.0005;

    private void printArray(double[] array) {
        for (int i = 0; i != array.length; i++) {
            System.out.println(array[i]);
        }
    }

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
        assertEquals(empty.length, 0);
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
        double[] fourthEquation = Arrays.solveQuadraticEquation(1, 0, -9);
        assertEquals(fourthEquation[0], -3, ACCURACY);
        assertEquals(fourthEquation[1], 3, ACCURACY);
        double[] fifthEquation = Arrays.solveQuadraticEquation(2, 1, 0);
        assertEquals(fifthEquation[0], -0.5, ACCURACY);
        assertEquals(fifthEquation[1], 0, ACCURACY);
        double[] sixthEquation = Arrays.solveQuadraticEquation(0, 0, 1);
        assertEquals(sixthEquation.length, 0);
    }

    @Test
    public void testSolveQuadraticEquationExceptions() {
        assertThrows(IllegalArgumentException.class, () -> Arrays.solveQuadraticEquation(Double.POSITIVE_INFINITY, 3, 9));
        assertThrows(IllegalArgumentException.class, () -> Arrays.solveQuadraticEquation(1, Double.NEGATIVE_INFINITY, 9));
        assertThrows(IllegalArgumentException.class, () -> Arrays.solveQuadraticEquation(0, 3, Double.NEGATIVE_INFINITY));
        assertThrows(IllegalArgumentException.class, () -> Arrays.solveQuadraticEquation(Double.NaN, 3, 9));
        assertThrows(IllegalArgumentException.class, () -> Arrays.solveQuadraticEquation(2, Double.NaN, 9));
        assertThrows(IllegalArgumentException.class, () -> Arrays.solveQuadraticEquation(0, 3, Double.NaN));
    }

    @Test
    public void testNotDivisibleByThree() {
        int[] empty = Arrays.notDivisibleByThree(0);
        assertEquals(empty.length, 0);
        int[] numbers = Arrays.notDivisibleByThree(15);
        assertNotEquals(numbers[0], 0);
        assertEquals(numbers[2], 4);
        assertEquals(numbers[3], 5);
        assertEquals(numbers[14], 22);
    }

    @Test
    public void testGetArithmeticProgression() {
        double[] empty = Arrays.getArithmeticProgression(25, 144, 0);
        assertEquals(empty.length, 0);
        double[] firstSequence = Arrays.getArithmeticProgression(1, 2.5, 7);
        assertEquals(firstSequence[0], 1, ACCURACY);
        assertEquals(firstSequence[6], 16, ACCURACY);
        assertEquals(firstSequence[3], 8.5, ACCURACY);
        double[] secondSequence = Arrays.getArithmeticProgression(1, -2.5, 7);
        assertEquals(secondSequence[0], 1, ACCURACY);
        assertEquals(secondSequence[3], -6.5, ACCURACY);
        assertEquals(secondSequence[6], -14, ACCURACY);
    }

    @Test
    public void testGetArithmeticProgressionInfinity() {
        double[] firstSequence = Arrays.getArithmeticProgression(Double.POSITIVE_INFINITY, 2, 3);
        assertEquals(firstSequence[0], Double.POSITIVE_INFINITY);
        assertEquals(firstSequence[2], Double.POSITIVE_INFINITY);
        double[] secondSequence = Arrays.getArithmeticProgression(Double.NEGATIVE_INFINITY, 5, 3);
        assertEquals(secondSequence[0], Double.NEGATIVE_INFINITY);
        assertEquals(secondSequence[2], Double.NEGATIVE_INFINITY);
        double[] thirdSequence = Arrays.getArithmeticProgression(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 3);
        assertEquals(thirdSequence[0], Double.NaN);
        assertEquals(thirdSequence[2], Double.POSITIVE_INFINITY);
        double[] fourthSequence = Arrays.getArithmeticProgression(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 3);
        assertEquals(fourthSequence[0], Double.NaN);
        assertEquals(fourthSequence[2], Double.NEGATIVE_INFINITY);
        double[] fifthSequence = Arrays.getArithmeticProgression(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 3);
        assertEquals(fifthSequence[0], Double.NaN);
        assertEquals(fifthSequence[2], Double.NaN);
    }

    @Test
    public void testGetGeometricProgression() {
        double[] firstSequence = Arrays.getGeometricProgression(1, 2, 5);
        assertEquals(firstSequence[1], 2, ACCURACY);
        assertEquals(firstSequence[4], 16, ACCURACY);
        assertNotEquals(firstSequence[0], 0, ACCURACY);
        double[] secondSequence = Arrays.getGeometricProgression(-1, -2, 5);
        assertNotEquals(secondSequence[0], 0, ACCURACY);
        assertEquals(secondSequence[2], -4, ACCURACY);
        assertEquals(secondSequence[4], -16, ACCURACY);
    }

    @Test
    public void testGetGeometricProgressionInfinity() {
        double[] firstSequence = Arrays.getGeometricProgression(Double.POSITIVE_INFINITY, -3, 4);
        assertEquals(firstSequence[1], Double.NEGATIVE_INFINITY);
        assertEquals(firstSequence[3], Double.NEGATIVE_INFINITY);
        double[] secondSequence = Arrays.getGeometricProgression(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 3);
        assertEquals(secondSequence[1], Double.POSITIVE_INFINITY);
        assertEquals(secondSequence[2], Double.POSITIVE_INFINITY);
        double[] thirdSequence = Arrays.getGeometricProgression(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, 3);
        assertEquals(thirdSequence[1], Double.NEGATIVE_INFINITY);
        assertEquals(thirdSequence[2], Double.POSITIVE_INFINITY);
        double[] fourthSequence = Arrays.getGeometricProgression(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 3);
        assertEquals(fourthSequence[1], Double.NEGATIVE_INFINITY);
        assertEquals(fourthSequence[2], Double.NEGATIVE_INFINITY);
    }
}