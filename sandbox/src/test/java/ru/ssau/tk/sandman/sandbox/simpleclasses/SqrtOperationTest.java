package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SqrtOperationTest {
    public static double ACCURACY = 0.00005;

    @Test
    public void testApplyPositiveNumber() {
        SqrtOperation operation = new SqrtOperation();
        double number = 2;
        assertEquals(operation.apply(number), Math.sqrt(number), ACCURACY);
    }

    @Test
    public void testApplyNegativeNumber() {
        SqrtOperation operation = new SqrtOperation();
        double negativeNumber = -2;
        assertThrows(ArithmeticException.class, () -> operation.apply(negativeNumber));
    }

    @Test
    public void testApplyInfinity() {
        SqrtOperation operation = new SqrtOperation();
        double testingPositiveInfinity = operation.apply(Double.POSITIVE_INFINITY);
        assertTrue(Double.isInfinite(testingPositiveInfinity));
        assertThrows(ArithmeticException.class, () -> operation.apply(Double.NEGATIVE_INFINITY));
    }

    @Test
    public void testApplyNaN() {
        SqrtOperation operation = new SqrtOperation();
        assertThrows(ArithmeticException.class, () -> operation.apply(Double.NaN));
    }

    @Test
    public void testApplyTriplePositiveNumber() {
        SqrtOperation operation = new SqrtOperation();
        double number = 256;
        assertEquals(operation.applyTriple(number), 2, ACCURACY);
    }

    @Test
    public void testApplyTripleNegativeNumber() {
        SqrtOperation operation = new SqrtOperation();
        double number = -1;
        assertThrows(ArithmeticException.class, () -> operation.applyTriple(number));
    }

    @Test
    public void testApplyTripleInfinity() {
        SqrtOperation operation = new SqrtOperation();
        double testingPositiveInfinity = operation.applyTriple(Double.POSITIVE_INFINITY);
        assertTrue(Double.isInfinite(testingPositiveInfinity));
        assertThrows(ArithmeticException.class, () -> operation.applyTriple(Double.NEGATIVE_INFINITY));
    }

    @Test
    public void testApplyTripleNaN() {
        SqrtOperation operation = new SqrtOperation();
        assertThrows(ArithmeticException.class, () -> operation.applyTriple(Double.NaN));
    }
}
