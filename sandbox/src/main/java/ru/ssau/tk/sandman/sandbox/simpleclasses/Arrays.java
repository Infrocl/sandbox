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
        for (int i = 1; i != numbers.length - 1; i++) {
            numbers[i] = 1;
        }
        return numbers;
    }
}
