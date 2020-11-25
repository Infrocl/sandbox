package ru.ssau.tk.sandman.sandbox.simpleclasses.Arrays;

public class Matrix {
    private final double[][] matrix;

    public Matrix(final int numberOfRows, final int numberOfColumns) {
        matrix = new double[numberOfRows][numberOfColumns];
    }

    public int getNumberOfRows() {
        return matrix.length;
    }

    public int getNumberOfColumns() {
        return matrix[0].length;
    }

    public double getAt(int m, int n) {
        return matrix[m][n];
    }

    public void setAt(int m, int n, double value) {
        matrix[m][n] = value;
    }
}
