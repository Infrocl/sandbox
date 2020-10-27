package ru.ssau.tk.sandman.sandbox.simpleclasses;

import static java.lang.StrictMath.abs;

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
        return new double[0];
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

    /**
     * Вычислительная сложность Решета Эратосфена: O(n log log n).
     *
     * @return Все простые числа до N.
     */
    public static int[] sieveOfEratosthenes(int N) {
        int sqrt = (int) Math.sqrt(N);
        int count = 1;
        int[] sieve = new int[sqrt + 1];
        for (int i = 2; i <= sqrt; i++) {
            if (i != 2 && sieve[i] == 0) {
                for (int k = i * i; k <= sqrt; k += 2 * i) {
                    sieve[k] = 1;
                }
                count += 1;
            }
            if (i == 2) {
                for (int k = i * i; k <= sqrt; k += i) {
                    sieve[k] = 1;
                }
            }
        }
        int[] result = new int[count];
        for (int i = 0, k = 2; i != count; k++) {
            if (sieve[k] == 0) {
                result[i] = k;
                i++;
            }
        }
        return result;
    }

    public static int[] getDivisors(int number) {
        int counter = 0;
        for (int i = 1; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                counter += 1;
            }
        }
        counter = 2 * counter - (Math.sqrt(number) == (int) Math.sqrt(number) ? 1 : 0);
        int[] result = new int[counter];
        for (int j = 0, k = 0; j != (int) Math.sqrt(number); j++) {
            if (number % (j + 1) == 0) {
                result[k] = j + 1;
                result[counter - 1 - k] = number / (j + 1);
                k += 1;
            }
        }
        return result;
    }

    public static int[] getSequence(int size) {
        int[] result = new int[size];
        int mid = size % 2 == 0 ? size / 2 : size / 2 + 1;
        for (int i = 0; i != mid; i++) {
            result[i] = i + 1;
            result[size - 1 - i] = i + 1;
        }
        return result;
    }

    public static void setOppositeSign(double[] array) {
        for (int i = 0; i != array.length; i++) {
            array[i] = -array[i];
        }
    }

    public static boolean findNumber(double[] array, double number) {
        if (Double.isInfinite(number)) {
            throw new IllegalArgumentException("Input value must be finite!");
        }
        if (Double.isNaN(number)) {
            for (int i = 0; i != array.length; i++) {
                if (Double.isNaN(array[i])) {
                    return true;
                }
            }
        }
        for (int i = 0; i != array.length; i++) {
            if (abs(array[i] - number) <= 0.00001) {
                return true;
            }
        }
        return false;
    }

    public static boolean findNull(Integer[] array) {
        for (int i = 0; i != array.length; i++) {
            if (array[i] == null) {
                return true;
            }
        }
        return false;
    }

    public static int countEvenNumbers(double[] array) {
        int counter = 0;
        for (int i = 0; i != array.length; i++) {
            counter += array[i] % 2 == 0 ? 1 : 0;
        }
        return counter;
    }

    public static Integer findMaxNumber(int[] array) {
        if (array.length == 0) {
            return null;
        }
        int maxNumber = array[0];
        for (int i = 1; i != array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public static double sumNumbersWithEvenIndexes(double[] array) {
        double sum = 0;
        if (array.length == 0) {
            return sum;
        }
        for (int i = 0; 2 + i <= array.length; i += 2) {
            sum += array[i];
        }
        return sum;
    }

    public static boolean compareNumberOfDivisors(int[] array) {
        int counter = 0;
        if (array.length == 0) {
            return false;
        }
        for (int i = 1; i != array.length - 1; i++) {
            if (array[i] % array[0] == 0) {
                counter += 1;
            }
            if (array[i] % array[array.length - 1] == 0) {
                counter -= 1;
            }
        }
        return counter > 0;
    }

    public static double findTheMostCommonNumber(double[] array) {
        double value;
        double maxValue = array[0];
        int maxCounter = 0;
        int counter = 0;
        for (int i = 0; i != array.length; i++) {
            if (Double.isNaN(array[i])) {
                throw new IllegalArgumentException("Array's elements can't be NaN!");
            }
            if (Double.isInfinite(array[i])) {
                throw new IllegalArgumentException("Array's elements must be finite!");
            }
            for (int j = i + 1; j != array.length; j++) {
                if (Math.abs(array[i] - array[j]) <= 0.00001) {
                    value = array[i + 1];     //помещаем одинаковые элементы рядом
                    array[i + 1] = array[j];  //чтобы сократить число итераций
                    array[j] = value;
                    counter += 1;
                }
            }
            i += counter;                     //пропускаем повторяющиеся элементы
            if (counter > maxCounter) {
                maxValue = array[i];
                maxCounter = counter;
            }
            counter = 0;
        }
        return maxValue;
    }

    public static int getIndex(double[] array, double number) {
        if (Double.isNaN(number)) {
            for (int i = 0; i != array.length; i++) {
                if (Double.isNaN(array[i])) {
                    return i;
                }
            }
            return -1;
        }
        for (int i = 0; i != array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void swapMaxAndMinElements(double[] array) {
        if (Double.isNaN(array[0])) {
            throw new IllegalArgumentException("Array's elements can't be NaN!");
        }
        double minNumber = array[0];
        double maxNumber = array[0];
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 1; i != array.length; i++) {
            if (Double.isNaN(array[i])) {
                throw new IllegalArgumentException("Array's elements can't be NaN!");
            }
            if (minNumber > array[i]) {
                minNumber = array[i];
                indexMin = i;
            }
            if (maxNumber < array[i]) {
                maxNumber = array[i];
                indexMax = i;
            }
        }
        array[indexMin] = maxNumber;
        array[indexMax] = minNumber;
    }

    public static void applyBitwiseNotToArray(int[] array) {
        for (int i = 0; i != array.length; i++) {
            array[i] = ~array[i];
        }
    }

    public static int[] getBitwiseNotArray(int[] array) {
        int[] returnArray = java.util.Arrays.copyOf(array, array.length);
        Arrays.applyBitwiseNotToArray(returnArray);
        return returnArray;
    }

    public static int[] sumAdjacentElements(int[] array) {
        if (array.length % 2 == 0) {
            int[] resultArray = new int[array.length / 2];
            for (int i = 0, j = 0; j != array.length; i++, j += 2) {
                resultArray[i] = array[j] + array[j + 1];
            }
            return resultArray;
        }
        int[] resultArray = new int[array.length / 2 + 1];
        for (int i = 0, j = 0; j != array.length - 1; i++, j += 2) {
            resultArray[i] = array[j] + array[j + 1];
        }
        resultArray[resultArray.length - 1] = array[array.length - 1];
        return resultArray;
    }

    public static boolean[] isEven(int[] array) {
        boolean[] resultArray = new boolean[array.length];
        for (int i = 0; i != array.length; i++) {
            resultArray[i] = array[i] % 2 == 0;
        }
        return resultArray;
    }

    public static int[] convertLongToTwoInts(long number) {
        return new int[]{(int) (number >> 32), (int) number};
    }

    public static long convertTwoIntsToLong(int first, int last) {
        return ((long) last | (long) first << 32);
    }
}
