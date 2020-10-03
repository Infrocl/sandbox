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

    public static double[] solveQuadraticEquation(double a, double b, double c) {
        if (Double.isInfinite(a) || Double.isInfinite(b) || Double.isInfinite(c)) {
            throw new IllegalArgumentException("Input coefficients must be finite!");
        }
        if (Double.isNaN(a) || Double.isNaN(b) || Double.isNaN(c)) {
            throw new IllegalArgumentException("Input coefficients can't be NaN!");
        }
        if (a == 0.0) {
            if (b == 0.0) {
                return Arrays.getNewSizeDoubleArray(0);
            }
            double[] result = Arrays.getNewSizeDoubleArray(1);
            result[0] = -c / b;
            return result;
        }
        double D = Math.pow(b, 2) - 4 * a * c;
        if (D > 0) {
            double[] result = Arrays.getNewSizeDoubleArray(2);
            result[0] = (-b - Math.sqrt(D)) / (2 * a);
            result[1] = (-b + Math.sqrt(D)) / (2 * a);
            return result;
        }
        if (D < 0) {
            return Arrays.getNewSizeDoubleArray(0);
        }
        if (D == 0.0) {
            double[] result = Arrays.getNewSizeDoubleArray(1);
            result[0] = -b / (2 * a);
            return result;
        }
        return Arrays.getNewSizeDoubleArray(0);
    }

    public static int[] notDivisibleByThree(int size) {
        int[] result = Arrays.getNewSizeIntArray(size);
        int k = 1;
        for (int i = 0; i != size; i++, k++) {
            result[i] = k;
            if ((k % 3) == 0) {
                result[i] = k + 1;
                k++;
            }
        }
        return result;
    }

    public static double[] getArithmeticProgression(double firstNumber, double commonDifference, int size) {
        double[] result = Arrays.getNewSizeDoubleArray(size);
        for (int i = 0; i != size; i++) {
            result[i] = firstNumber + i * commonDifference;
        }
        return result;
    }

    public static double[] getGeometricProgression(double firstNumber, double commonRatio, int size) {
        double[] result = Arrays.getNewSizeDoubleArray(size);
        for (int i = 0; i != size; i++) {
            result[i] = firstNumber * Math.pow(commonRatio, i);
        }
        return result;
    }
}
