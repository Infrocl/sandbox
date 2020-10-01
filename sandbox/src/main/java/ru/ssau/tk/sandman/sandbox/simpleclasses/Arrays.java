package ru.ssau.tk.sandman.sandbox.simpleclasses;

public class Arrays {
    private Arrays() {
    }

    public static int[] getNewSizeIntArray(int size) {
        return new int[size];
    }

    public static double[] getNewSizeDoubleArray(int size) {
        return new double[size];
    }

    public static int[] getOnesAndTwosArray(int size) {
        int[] numbers = Arrays.getNewSizeIntArray(size);
        numbers[0] = 2;
        numbers[size - 1] = 2;
        for (int i = 1; i != size - 1; i++) {
            numbers[i] = 1;
        }
        return numbers;
    }

    public static int[] getOddNumbersArray(int size) {
        int[] numbers = Arrays.getNewSizeIntArray(size);
        for (int i = 0; i != size; i++) {
            numbers[i] = 2 * i + 1;
        }
        return numbers;
    }

    public static int[] getReversedEvenNumbersArray(int size) {
        int[] numbers = Arrays.getNewSizeIntArray(size);
        for (int i = 0; i != size; i++) {
            numbers[i] = size * 2 - 2 * i;
        }
        return numbers;
    }

    public static int[] getFibonacciNumbersArray(int size) {
        int[] numbers = Arrays.getNewSizeIntArray(size);
        int b = 1;
        for (int i = 0; i != size - 1; i++) {
            numbers[i + 1] = numbers[i] + b;
            b = numbers[i];
        }
        return numbers;
    }

    public static double[] getArrayOfSqrIndexes(int size) {
        double[] numbers = Arrays.getNewSizeDoubleArray(size);
        for (int i = 0; i != size; i++) {
            numbers[i] = Math.pow(i, 2);
        }
        return numbers;
    }
}
