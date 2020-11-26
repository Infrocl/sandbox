package ru.ssau.tk.sandman.sandbox.simpleclasses.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class MatrixTest {
    private final Matrix matrix = new Matrix(3, 2);
    private final Matrix secondMatrix = new Matrix(2, 1);
    final private double ACCURACY = 0.0005;

    @Test
    public void testGetNumberOfRows() {
        assertEquals(matrix.getNumberOfRows(), 3);
        assertEquals(secondMatrix.getNumberOfRows(), 2);
    }

    @Test
    public void testGetNumberOfColumns() {
        assertEquals(matrix.getNumberOfColumns(), 2);
        assertEquals(secondMatrix.getNumberOfColumns(), 1);
    }

    @Test
    public void testSetAtAndGetAt() {
        final Matrix brokenMatrix = new Matrix(0, 1);
        final Matrix anotherBrokenMatrix = new Matrix(1, 0);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> brokenMatrix.setAt(0,1, 1.0));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> anotherBrokenMatrix.setAt(0,0, 1.0));
        for (int i = 0; i != 3; i++) {
            for (int j = 0; j != 2; j++) {
                matrix.setAt(i, j, j);
                assertEquals(matrix.getAt(i, j), j, ACCURACY);
            }
        }
        for (int i = 0; i != 2; i++) {
            secondMatrix.setAt(i, 0, i);
            assertEquals(secondMatrix.getAt(i, 0), i, ACCURACY);
        }
        Matrices.printMatrix(matrix);
        Matrices.printMatrix(secondMatrix);
    }
}