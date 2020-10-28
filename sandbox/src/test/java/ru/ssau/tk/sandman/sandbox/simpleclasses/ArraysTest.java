package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraysTest {
    final private double ACCURACY = 0.0005;

    private double[] getScaryArray() {
        return new double[]{Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};
    }

    private void printArray(double[] array) {
        for (int i = 0; i != array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private void printArray(int[] array) {
        for (int i = 0; i != array.length; i++) {
            System.out.println(array[i]);
        }
    }

    @Test
    public void testGetNewSizeIntArray() {
        final int[] numbers = Arrays.getNewSizeIntArray(5);
        final int[] empty = Arrays.getNewSizeIntArray(0);
        assertEquals(numbers[2], 0);
        assertEquals(numbers.length, 5);
        assertEquals(empty.length, 0);
    }

    @Test
    public void testGetOnesAndTwosArray() {
        final int[] numbers = Arrays.getOnesAndTwosArray(5);
        assertEquals(numbers[0], 2);
        assertEquals(numbers[4], 2);
        assertNotEquals(numbers[1], 0);
        assertNotEquals(numbers[2], 0);
        assertNotEquals(numbers[3], 0);
    }

    @Test
    public void testGetOddNumbersArray() {
        final int[] empty = Arrays.getOddNumbersArray(0);
        final int[] numbers = Arrays.getOddNumbersArray(5);
        assertEquals(empty.length, 0);
        assertEquals(numbers[2], 5);
        assertEquals(numbers[3], 7);
        assertEquals(numbers[1], 3);
        assertNotEquals(numbers[0], 0);
        assertNotEquals(numbers[4], 0);
    }

    @Test
    public void testGetReversedEvenNumbersArray() {
        final int[] numbers = Arrays.getReversedEvenNumbersArray(5);
        assertEquals(numbers[0], 10);
        assertEquals(numbers[4], 2);
        assertNotEquals(numbers[1], 9);
        assertEquals(numbers[2], 6);
    }

    @Test
    public void testGetFibonacciNumbersArray() {
        final int[] numbers = Arrays.getFibonacciNumbersArray(7);
        assertEquals(numbers[6], 8);
        assertEquals(numbers[0], 0);
        assertEquals(numbers[3], 2);
        assertNotEquals(numbers[4], 4);
    }

    @Test
    public void testGetArrayOfSqrIndexes() {
        final double[] empty = Arrays.getArrayOfSqrIndexes(0);
        assertEquals(empty.length, 0);
        final double[] numbers = Arrays.getArrayOfSqrIndexes(5);
        assertEquals(numbers[0], 0.0);
        assertEquals(numbers[4], 16.0);
        assertEquals(numbers[3], 9.0);
        assertNotEquals(numbers[2], 2.0);
        assertNotEquals(numbers[2], 4);
    }

    @Test
    public void testGetNewSizeDoubleArray() {
        final double[] numbers = Arrays.getNewSizeDoubleArray(5);
        final double[] empty = Arrays.getNewSizeDoubleArray(0);
        assertEquals(numbers[2], 0.0);
        assertEquals(numbers.length, 5);
        assertEquals(empty.length, 0);
    }

    @Test
    public void testSolveQuadraticEquation() {
        final double[] firstEquation = Arrays.solveQuadraticEquation(0.0005, 2, 5);
        assertEquals(firstEquation[0], -3997.4984, ACCURACY);
        assertEquals(firstEquation[1], -2.50156, ACCURACY);
        assertEquals(firstEquation.length, 2);
        final double[] secondEquation = Arrays.solveQuadraticEquation(0, -3, -9);
        assertEquals(secondEquation.length, 1);
        assertEquals(secondEquation[0], -3, ACCURACY);
        final double[] thirdEquation = Arrays.solveQuadraticEquation(1, 2, 16);
        assertEquals(thirdEquation.length, 0);
        final double[] fourthEquation = Arrays.solveQuadraticEquation(1, 0, -9);
        assertEquals(fourthEquation[0], -3, ACCURACY);
        assertEquals(fourthEquation[1], 3, ACCURACY);
        final double[] fifthEquation = Arrays.solveQuadraticEquation(2, 1, 0);
        assertEquals(fifthEquation[0], -0.5, ACCURACY);
        assertEquals(fifthEquation[1], 0, ACCURACY);
        final double[] sixthEquation = Arrays.solveQuadraticEquation(0, 0, 1);
        assertEquals(sixthEquation.length, 0);
        final double[] seventhEquation = Arrays.solveQuadraticEquation(1, -4, 4);
        assertEquals(seventhEquation[0], 2.0);
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
        final int[] empty = Arrays.notDivisibleByThree(0);
        assertEquals(empty.length, 0);
        final int[] numbers = Arrays.notDivisibleByThree(15);
        assertNotEquals(numbers[0], 0);
        assertEquals(numbers[2], 4);
        assertEquals(numbers[3], 5);
        assertEquals(numbers[14], 22);
    }

    @Test
    public void testGetArithmeticProgression() {
        final double[] empty = Arrays.getArithmeticProgression(25, 144, 0);
        assertEquals(empty.length, 0);
        final double[] firstSequence = Arrays.getArithmeticProgression(1, 2.5, 7);
        assertEquals(firstSequence[0], 1, ACCURACY);
        assertEquals(firstSequence[6], 16, ACCURACY);
        assertEquals(firstSequence[3], 8.5, ACCURACY);
        final double[] secondSequence = Arrays.getArithmeticProgression(1, -2.5, 7);
        assertEquals(secondSequence[0], 1, ACCURACY);
        assertEquals(secondSequence[3], -6.5, ACCURACY);
        assertEquals(secondSequence[6], -14, ACCURACY);
    }

    @Test
    public void testGetArithmeticProgressionInfinity() {
        final double[] firstSequence = Arrays.getArithmeticProgression(Double.POSITIVE_INFINITY, 2, 3);
        assertEquals(firstSequence[0], Double.POSITIVE_INFINITY);
        assertEquals(firstSequence[2], Double.POSITIVE_INFINITY);
        final double[] secondSequence = Arrays.getArithmeticProgression(Double.NEGATIVE_INFINITY, 5, 3);
        assertEquals(secondSequence[0], Double.NEGATIVE_INFINITY);
        assertEquals(secondSequence[2], Double.NEGATIVE_INFINITY);
        final double[] thirdSequence = Arrays.getArithmeticProgression(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 3);
        assertEquals(thirdSequence[0], Double.NaN);
        assertEquals(thirdSequence[2], Double.POSITIVE_INFINITY);
        final double[] fourthSequence = Arrays.getArithmeticProgression(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 3);
        assertEquals(fourthSequence[0], Double.NaN);
        assertEquals(fourthSequence[2], Double.NEGATIVE_INFINITY);
        final double[] fifthSequence = Arrays.getArithmeticProgression(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 3);
        assertEquals(fifthSequence[0], Double.NaN);
        assertEquals(fifthSequence[2], Double.NaN);
    }

    @Test
    public void testGetGeometricProgression() {
        final double[] firstSequence = Arrays.getGeometricProgression(1, 2, 5);
        assertEquals(firstSequence[1], 2, ACCURACY);
        assertEquals(firstSequence[4], 16, ACCURACY);
        assertNotEquals(firstSequence[0], 0, ACCURACY);
        final double[] secondSequence = Arrays.getGeometricProgression(-1, -2, 5);
        assertNotEquals(secondSequence[0], 0, ACCURACY);
        assertEquals(secondSequence[2], -4, ACCURACY);
        assertEquals(secondSequence[4], -16, ACCURACY);
    }

    @Test
    public void testGetGeometricProgressionInfinity() {
        final double[] firstSequence = Arrays.getGeometricProgression(Double.POSITIVE_INFINITY, -3, 4);
        assertEquals(firstSequence[1], Double.NEGATIVE_INFINITY);
        assertEquals(firstSequence[3], Double.NEGATIVE_INFINITY);
        final double[] secondSequence = Arrays.getGeometricProgression(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 3);
        assertEquals(secondSequence[1], Double.POSITIVE_INFINITY);
        assertEquals(secondSequence[2], Double.POSITIVE_INFINITY);
        final double[] thirdSequence = Arrays.getGeometricProgression(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, 3);
        assertEquals(thirdSequence[1], Double.NEGATIVE_INFINITY);
        assertEquals(thirdSequence[2], Double.POSITIVE_INFINITY);
        final double[] fourthSequence = Arrays.getGeometricProgression(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 3);
        assertEquals(fourthSequence[1], Double.NEGATIVE_INFINITY);
        assertEquals(fourthSequence[2], Double.NEGATIVE_INFINITY);
    }

    @Test
    public void testSieveOfEratosthenes() {
        final int[] primeNumbers1 = Arrays.sieveOfEratosthenes(14_401);
        assertNotEquals(primeNumbers1[0], 1);
        assertEquals(primeNumbers1.length, 30);
        assertEquals(primeNumbers1[29], 113);
        assertEquals(primeNumbers1[7], 19);
        final int[] primeNumbers2 = Arrays.sieveOfEratosthenes(169);
        assertEquals(primeNumbers2.length, 6);
        assertNotEquals(primeNumbers1[0], 1);
        assertEquals(primeNumbers2[5], 13);
        assertEquals(primeNumbers2[3], 7);
    }

    @Test
    public void testGetDivisors() {
        final int[] divisors = Arrays.getDivisors(75);
        assertEquals(divisors.length, 6);
        assertEquals(divisors[0], 1);
        assertEquals(divisors[5], 75);
        assertEquals(divisors[3], 15);
        final int[] divisorsOf144 = Arrays.getDivisors(144);
        assertEquals(divisorsOf144.length, 15);
        assertEquals(divisorsOf144[0], 1);
        assertEquals(divisorsOf144[14], 144);
        assertEquals(divisorsOf144[6], 9);
    }

    @Test
    public void testGetSequence() {
        final int[] empty = Arrays.getSequence(0);
        assertEquals(empty.length, 0);
        final int[] firstSequence = Arrays.getSequence(7);
        assertEquals(firstSequence[3], 4);
        assertEquals(firstSequence[6], 1);
        assertNotEquals(firstSequence[0], 0);
        final int[] secondSequence = Arrays.getSequence(8);
        assertEquals(secondSequence[4], 4);
        assertEquals(secondSequence[3], 4);
        assertEquals(secondSequence[7], 1);
        assertNotEquals(secondSequence[0], 0);
    }

    @Test
    public void testSetOppositeSign() {
        double[] array = {1.0, 2.0, -3.0, 0.0, 5.0};
        Arrays.setOppositeSign(array);
        assertEquals(array[0], -1.0);
        assertEquals(array[2], 3.0);
        assertEquals(array[3], -0.0);
        assertNotEquals(array[4], 5.0);
        double[] empty = new double[0];
        Arrays.setOppositeSign(empty);
    }

    @Test
    public void testSetOppositeSignInfinityAndNaN() {
        double[] array = getScaryArray();
        Arrays.setOppositeSign(array);
        assertEquals(array[1], Double.NEGATIVE_INFINITY);
        assertEquals(array[2], Double.POSITIVE_INFINITY);
        assertEquals(array[0], Double.NaN);
    }

    @Test
    public void testFindNumber() {
        double[] array = {1.000001, 2.0, 35.2580002, 0.0};
        assertTrue(Arrays.findNumber(array, 1));
        assertTrue(Arrays.findNumber(array, 35.258));
        assertFalse(Arrays.findNumber(array, 2.001));
        assertTrue(Arrays.findNumber(array, -0.0));
        assertFalse(Arrays.findNumber(array, Double.NaN));
        double[] empty = new double[0];
        assertFalse(Arrays.findNumber(empty, 0));
    }

    @Test
    public void testFindNumberInfinityAndNaN() {
        final double[] array = {Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NaN};
        assertTrue(Arrays.findNumber(array, Double.NaN));
        assertThrows(IllegalArgumentException.class, () -> Arrays.findNumber(array, Double.NEGATIVE_INFINITY));
        assertThrows(IllegalArgumentException.class, () -> Arrays.findNumber(array, Double.POSITIVE_INFINITY));
    }

    @Test
    public void testFindNull() {
        final Integer[] empty = new Integer[0];
        final Integer[] array = {1, 2, null, 45, 0};
        final Integer[] zeroArray = {0, 0, 0};
        assertTrue(Arrays.findNull(array));
        assertFalse(Arrays.findNull(empty));
        assertFalse(Arrays.findNull(zeroArray));
    }

    @Test
    public void testCountEvenNumbers() {
        final double[] empty = new double[0];
        final double[] array = {1, 2, 3, 2.5, 1.75, 0.0};
        final double[] scaryArray = getScaryArray();
        assertEquals(Arrays.countEvenNumbers(empty), 0);
        assertEquals(Arrays.countEvenNumbers(array), 2);
        assertEquals(Arrays.countEvenNumbers(scaryArray), 0);
    }

    @Test
    public void testFindMaxNumber() {
        final int[] empty = new int[0];
        final int[] array = {1, 2, 75, 35, 40, 0};
        final int[] unitArray = {1, 1, 1};
        assertNull(Arrays.findMaxNumber(empty));
        assertEquals(Arrays.findMaxNumber(array), Integer.valueOf(75));
        assertEquals(Arrays.findMaxNumber(unitArray), Integer.valueOf(1));
    }

    @Test
    public void testSumNumbersWithEvenIndexes() {
        final double[] empty = new double[0];
        final double[] array = {1.0, 2, 3.5, 4};
        final double[] infinityArray = {0, 1, Double.POSITIVE_INFINITY, 2, Double.NEGATIVE_INFINITY, 3};
        final double[] anotherInfinityArray = {0, 1, Double.NEGATIVE_INFINITY, 2, Double.NEGATIVE_INFINITY, 3};
        final double[] nanArray = {Double.NaN, 2, Double.NEGATIVE_INFINITY};
        assertEquals(Arrays.sumNumbersWithEvenIndexes(empty), 0, ACCURACY);
        assertEquals(Arrays.sumNumbersWithEvenIndexes(array), 4.5, ACCURACY);
        assertEquals(Arrays.sumNumbersWithEvenIndexes(infinityArray), Double.NaN);
        assertEquals(Arrays.sumNumbersWithEvenIndexes(anotherInfinityArray), Double.NEGATIVE_INFINITY);
        assertEquals(Arrays.sumNumbersWithEvenIndexes(nanArray), Double.NaN);
    }

    @Test
    public void testCompareNumberOfDivisors() {
        final int[] empty = new int[0];
        final int[] firstArray = {1, 2, 3, 4};
        final int[] lastArray = {2, 3, 4, 1};
        final int[] unitArray = {1, 1, 1, 1};
        assertFalse(Arrays.compareNumberOfDivisors(empty));
        assertTrue(Arrays.compareNumberOfDivisors(firstArray));
        assertFalse(Arrays.compareNumberOfDivisors(lastArray));
        assertFalse(Arrays.compareNumberOfDivisors(unitArray));
    }

    @Test
    public void testFindTheMostCommonNumber() {
        final double[] array = {1, 2, 1, 3, 4, 3, 5};
        final double[] secondArray = {0, 2, 6, 5, 4, 3, 0};
        final double[] thirdArray = {3, 2, 6, 5, 4, 3.5, 0};
        assertEquals(Arrays.findTheMostCommonNumber(array), 1.0);
        assertEquals(Arrays.findTheMostCommonNumber(secondArray), 0.0);
        assertEquals(Arrays.findTheMostCommonNumber(thirdArray), 3.0);
    }

    @Test
    public void testFindTheMostCommonNumberInfinityAndNan() {
        double[] array = {1, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY};
        double[] secondArray = {1, Double.NaN};
        assertThrows(IllegalArgumentException.class, () -> Arrays.findTheMostCommonNumber(array));
        assertThrows(IllegalArgumentException.class, () -> Arrays.findTheMostCommonNumber(secondArray));
    }

    @Test
    public void testGetIndex() {
        final double[] array = {1.0, 20.0, 25.0, 20.0};
        final double[] scaryArray = getScaryArray();
        assertEquals(Arrays.getIndex(array, 20), 1);
        assertEquals(Arrays.getIndex(array, Double.NaN), -1);
        assertEquals(Arrays.getIndex(scaryArray, Double.NaN), 0);
        assertEquals(Arrays.getIndex(scaryArray, Double.POSITIVE_INFINITY), 1);
        assertEquals(Arrays.getIndex(scaryArray, Double.NEGATIVE_INFINITY), 2);
        assertEquals(Arrays.getIndex(scaryArray, 1), -1);
    }

    @Test
    public void testSwapMaxAndMinElements() {
        double[] array = {1.0, 3.0, 5.0, 0.1, 6.0, 6.0, 0.1};
        double[] scaryArray = getScaryArray();
        double[] notThatScaryArray = {1, 2, 3, Double.NaN};
        Arrays.swapMaxAndMinElements(array);
        assertEquals(array[4], 0.1);
        assertEquals(array[3], 6.0);
        assertEquals(array[5], 6.0);
        assertEquals(array[6], 0.1);
        assertThrows(IllegalArgumentException.class, () -> Arrays.swapMaxAndMinElements(scaryArray));
        assertThrows(IllegalArgumentException.class, () -> Arrays.swapMaxAndMinElements(notThatScaryArray));
    }

    @Test
    public void testApplyBitwiseNotToArray() {
        int[] array = {10, 0, 200, -5};
        final int[] emptyArray = new int[0];
        Arrays.applyBitwiseNotToArray(emptyArray);
        Arrays.applyBitwiseNotToArray(array);
        assertEquals(array[0], -11);
        assertEquals(array[1], -1);
        assertEquals(array[2], -201);
        assertEquals(array[3], 4);
        Arrays.applyBitwiseNotToArray(array);
        assertEquals(array[0], 10);
        assertEquals(array[1], 0);
        assertEquals(array[2], 200);
        assertEquals(array[3], -5);
    }

    @Test
    public void testGetBitwiseNotArray() {
        final int[] array = {10, 0, 200, -5};
        int[] testArray = Arrays.getBitwiseNotArray(array);
        assertEquals(array[0], 10);
        assertEquals(array[1], 0);
        assertEquals(array[2], 200);
        assertEquals(array[3], -5);
        assertEquals(testArray[0], -11);
        assertEquals(testArray[1], -1);
        assertEquals(testArray[2], -201);
        assertEquals(testArray[3], 4);
        testArray = Arrays.getBitwiseNotArray(testArray);
        assertEquals(testArray[0], 10);
        assertEquals(testArray[1], 0);
        assertEquals(testArray[2], 200);
        assertEquals(testArray[3], -5);
    }

    @Test
    public void testSumAdjacentElements() {
        final int[] array = {10, 20, 30, 40};
        final int[] secondArray = {10, 20, 35};
        final int[] sumArray = Arrays.sumAdjacentElements(array);
        final int[] sumSecondArray = Arrays.sumAdjacentElements(secondArray);
        int[] emptyArray = new int[0];
        emptyArray = Arrays.sumAdjacentElements(emptyArray);
        assertEquals(sumArray.length, 2);
        assertEquals(sumSecondArray.length, 2);
        assertEquals(emptyArray.length, 0);
        assertEquals(sumArray[0], 30);
        assertEquals(sumArray[1], 70);
        assertEquals(sumSecondArray[0], 30);
        assertEquals(sumSecondArray[1], 35);
    }

    @Test
    public void testIsEven() {
        final int[] array = {0, 1, 2, 3, 4};
        final boolean[] booleanArray = Arrays.isEven(array);
        final int[] emptyArray = new int[0];
        final boolean[] booleanEmpty = Arrays.isEven(emptyArray);
        assertEquals(array.length, booleanArray.length);
        assertEquals(emptyArray.length, booleanEmpty.length);
        assertTrue(booleanArray[0]);
        assertFalse(booleanArray[1]);
        assertTrue(booleanArray[2]);
        assertFalse(booleanArray[3]);
        assertTrue(booleanArray[4]);
    }

    @Test
    public void testConvertLongToTwoInts() {
        final int[] array = Arrays.convertLongToTwoInts(-2L);
        final int[] secondArray = Arrays.convertLongToTwoInts(12666666666L);
        assertEquals(Integer.toBinaryString(array[0]), Integer.toBinaryString(-1));
        assertEquals(Integer.toBinaryString(array[1]), Integer.toBinaryString(-2));
        assertEquals(Integer.toBinaryString(secondArray[0]), Integer.toBinaryString(2));
        assertEquals(Integer.toBinaryString(secondArray[1]), Long.toBinaryString(4076732074L));
    }

    @Test
    public void testConvertTwoIntsToLong() {
        final long result = Arrays.convertTwoIntsToLong(-1, -2);
        final long anotherResult = Arrays.convertTwoIntsToLong(2, 2);
        assertEquals(result, -2);
        assertEquals(anotherResult, 8589934594L);
    }

    @Test
    public void testGetCycleOfNaturalNumbers() {
        final int[] array = Arrays.getCycleOfNaturalNumbers(6, 2);
        final int[] normalArray = Arrays.getCycleOfNaturalNumbers(5, 0);
        final int[] reversedArray = Arrays.getCycleOfNaturalNumbers(5, 4);
        assertEquals(array[0], 5);
        assertEquals(array[2], 1);
        assertEquals(array[5], 4);
        assertEquals(normalArray[0], 1);
        assertEquals(normalArray[4], 5);
        assertEquals(normalArray[2], 3);
        assertEquals(reversedArray[4], 1);
        assertEquals(reversedArray[0], 2);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Arrays.getCycleOfNaturalNumbers(5, -3));
        assertThrows(NegativeArraySizeException.class, () -> Arrays.getCycleOfNaturalNumbers(-2, -3));
        assertThrows(IllegalArgumentException.class, () -> Arrays.getCycleOfNaturalNumbers(3, 4));
    }

    @Test
    public void testGetSteppedArrayOfNaturalNumbers() {
        int[][] array = Arrays.getSteppedArrayOfNaturalNumbers(3);
        int[][] emptyArray = Arrays.getSteppedArrayOfNaturalNumbers(0);
        int[][] anotherArray = Arrays.getSteppedArrayOfNaturalNumbers(6);
        assertEquals(array[0].length, 3);
        assertEquals(array[2].length, 1);
        assertEquals(emptyArray.length, 0);
        assertEquals(anotherArray[0].length, 6);
        assertEquals(anotherArray[5].length, 1);
        assertEquals(array[0][0], 1);
        assertEquals(array[0][2], 3);
        assertEquals(array[2][0], 6);
        assertEquals(anotherArray[0][0], 1);
        assertEquals(anotherArray[0][5], 6);
        assertEquals(anotherArray[5][0], 21);
    }
}