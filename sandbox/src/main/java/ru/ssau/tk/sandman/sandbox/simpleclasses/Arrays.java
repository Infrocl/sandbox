package ru.ssau.tk.sandman.sandbox.simpleclasses;

public class Arrays {
    private Arrays() {
    }

    public static int[] getNewDimensionArray(int dimension) {
        return new int[dimension];
    }

    public static int[] getOnesAndTwosArray(int dimension) {
        int[] numbers = Arrays.getNewDimensionArray(dimension);
        numbers[0] = 2;
        numbers[dimension - 1] = 2;
        for (int i = 1; i != dimension - 1; i++) {
            numbers[i] = 1;
        }
        return numbers;
    }

    public static int[] getOddNumbersArray(int dimension) {
        int[] numbers = Arrays.getNewDimensionArray(dimension);
        for (int i = 0; i != dimension; i++) {
            numbers[i] = 2 * i + 1;
        }
        return numbers;
    }

    public static int[] getReversedEvenNumbersArray(int dimension) {
        int[] numbers = Arrays.getNewDimensionArray(dimension);
        for (int i = 0; i != dimension; i++) {
            numbers[i] = dimension * 2 - 2 * i;
        }
        return numbers;
    }
}
