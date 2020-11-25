package ru.ssau.tk.sandman.sandbox.simpleclasses.Arrays;

public class Matrices {
    private Matrices() {
    }

    private interface BiOperation {
        double apply(int a, int b);
    }

    private static Matrix doOperation(Matrix firstMatrix, Matrix secondMatrix, BiOperation operation) {
        Matrix result = new Matrix(firstMatrix.getNumberOfRows(), secondMatrix.getNumberOfColumns());
        for (int i = 0; i != firstMatrix.getNumberOfRows(); i++) {
            for (int j = 0; j != secondMatrix.getNumberOfColumns(); j++) {
                result.setAt(i, j, operation.apply(i, j));
            }
        }
        return result;
    }

    public static Matrix sum(Matrix firstMatrix, Matrix secondMatrix) {
        if (firstMatrix.getNumberOfRows() != secondMatrix.getNumberOfRows() || firstMatrix.getNumberOfColumns()
                != secondMatrix.getNumberOfColumns()) {
            throw new IllegalArgumentException("Dimensions of matrices are not equal!");
        }
        return doOperation(firstMatrix, secondMatrix, (a, b) -> firstMatrix.getAt(a, b) + secondMatrix.getAt(a, b));
    }

    public static Matrix subtract(Matrix firstMatrix, Matrix secondMatrix) {
        if (firstMatrix.getNumberOfRows() != secondMatrix.getNumberOfRows() || firstMatrix.getNumberOfColumns()
                != secondMatrix.getNumberOfColumns()) {
            throw new IllegalArgumentException("Dimensions of matrices are not equal!");
        }
        return doOperation(firstMatrix, secondMatrix, (a, b) -> firstMatrix.getAt(a, b) - secondMatrix.getAt(a, b));
    }

    public static Matrix multiplyOnNumber(Matrix matrix, double number) {
        return doOperation(matrix, matrix, (a, b) -> matrix.getAt(a, b) * number);
    }

    public static Matrix multiply(Matrix firstMatrix, Matrix secondMatrix) {
        if (firstMatrix.getNumberOfColumns() != secondMatrix.getNumberOfRows()) {
            throw new IllegalArgumentException("Dimensions of matrices are not consistent!");
        }
        return doOperation(firstMatrix, secondMatrix, (a, b) -> {
            double sum = 0;
            for (int i = 0; i != secondMatrix.getNumberOfRows(); i++) {
                sum += firstMatrix.getAt(a, i) * secondMatrix.getAt(i, b);
            }
            return sum;
        });
    }

    public static void printMatrix(Matrix matrix) {
        for (int i = 0; i != matrix.getNumberOfRows(); i++) {
            for (int j = 0; j != matrix.getNumberOfColumns(); j++) {
                System.out.print(matrix.getAt(i, j) + " ");
            }
            System.out.println();
        }
    }
}