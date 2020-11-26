package ru.ssau.tk.sandman.sandbox.simpleclasses.Arrays;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class MatricesTest {
    private final Matrix matrix = new Matrix(3, 2);
    private final Matrix secondMatrix = new Matrix(2, 1);
    final private double ACCURACY = 0.0005;

    @BeforeTest
    public void setMatrix() {
        for (int i = 0; i != 3; i++) {
            for (int j = 0; j != 2; j++) {
                matrix.setAt(i, j, j + 1);
            }
        }
        for (int i = 0; i != 2; i++) {
            secondMatrix.setAt(i, 0, i + 1);
        }
    }

    @Test
    public void testSum() {
        final Matrix firstSum = Matrices.sum(matrix, matrix);
        final Matrix secondSum = Matrices.sum(secondMatrix, secondMatrix);
        assertThrows(IllegalArgumentException.class, () -> Matrices.sum(matrix, secondMatrix));
        assertEquals(firstSum.getNumberOfRows(), 3);
        assertEquals(firstSum.getNumberOfColumns(), 2);
        assertEquals(secondSum.getNumberOfColumns(), 1);
        assertEquals(secondSum.getNumberOfRows(), 2);
        for (int i = 0; i != 3; i++) {
            for (int j = 0; j != 2; j++) {
                assertEquals(firstSum.getAt(i, j), 2 * (j + 1), ACCURACY);
            }
        }
        for (int i = 0; i != 2; i++) {
            assertEquals(secondSum.getAt(i, 0), 2 * (i + 1), ACCURACY);
        }
    }

    @Test
    public void testSubtract() {
        final Matrix firstSub = Matrices.subtract(matrix, matrix);
        final Matrix secondSub = Matrices.subtract(secondMatrix, secondMatrix);
        assertThrows(IllegalArgumentException.class, () -> Matrices.subtract(secondMatrix, matrix));
        assertEquals(firstSub.getNumberOfRows(), 3);
        assertEquals(firstSub.getNumberOfColumns(), 2);
        assertEquals(secondSub.getNumberOfColumns(), 1);
        assertEquals(secondSub.getNumberOfRows(), 2);
        for (int i = 0; i != 3; i++) {
            for (int j = 0; j != 2; j++) {
                assertEquals(firstSub.getAt(i, j), 0.0, ACCURACY);
            }
        }
        for (int i = 0; i != 2; i++) {
            assertEquals(secondSub.getAt(i, 0), 0.0, ACCURACY);
        }
    }

    @Test
    public void testMultiplyOnNumber() {
        final Matrix doubledMatrix = Matrices.multiplyOnNumber(matrix, 2);
        final Matrix tripledMatrix = Matrices.multiplyOnNumber(secondMatrix, 3);
        assertEquals(doubledMatrix.getNumberOfRows(), 3);
        assertEquals(doubledMatrix.getNumberOfColumns(), 2);
        assertEquals(tripledMatrix.getNumberOfColumns(), 1);
        assertEquals(tripledMatrix.getNumberOfRows(), 2);
        for (int i = 0; i != 3; i++) {
            for (int j = 0; j != 2; j++) {
                assertEquals(doubledMatrix.getAt(i, j), 2 * (j + 1), ACCURACY);
            }
        }
        for (int i = 0; i != 2; i++) {
            assertEquals(tripledMatrix.getAt(i, 0), 3 * (i + 1), ACCURACY);
        }
    }

    @Test
    public void testMultiply() {
        final Matrix multiMatrix = Matrices.multiply(matrix, secondMatrix);
        assertThrows(IllegalArgumentException.class, () -> Matrices.multiply(matrix, matrix));
        assertThrows(IllegalArgumentException.class, () -> Matrices.multiply(secondMatrix, matrix));
        assertEquals(multiMatrix.getNumberOfRows(), 3);
        assertEquals(multiMatrix.getNumberOfColumns(), 1);
        for (int i = 0; i != 3; i++) {
            assertEquals(multiMatrix.getAt(i, 0), 5, ACCURACY);
        }
    }
}
