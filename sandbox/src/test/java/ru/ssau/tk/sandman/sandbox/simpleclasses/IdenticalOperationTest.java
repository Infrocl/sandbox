package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdenticalOperationTest {
    public static double ACCURACY = 0.00005;

    @Test
    public void testApply() {
        IdenticalOperation operation = new IdenticalOperation();
        double number = 1;
        assertEquals(operation.apply(number), number, ACCURACY);
    }

    @Test
    public void testApplyInfinity() {
        IdenticalOperation operation = new IdenticalOperation();
        double testingPositiveInfinity = operation.apply(Double.POSITIVE_INFINITY);
        double testingNegativeInfinity = operation.apply(Double.NEGATIVE_INFINITY);
        assertTrue(Double.isInfinite(testingPositiveInfinity));
        assertTrue(Double.isInfinite(testingNegativeInfinity));
    }

    @Test
    public void testApplyNaN() {
        IdenticalOperation operation = new IdenticalOperation();
        double testingNaN = operation.apply(Double.NaN);
        assertTrue(Double.isNaN(testingNaN));
    }

    @Test
    public void testApplyTriple() {
        IdenticalOperation operation = new IdenticalOperation();
        double number = -2;
        assertEquals(operation.applyTriple(number), number, ACCURACY);
    }

    @Test
    public void testApplyTripleInfinity() {
        IdenticalOperation operation = new IdenticalOperation();
        double testingPositiveInfinity = operation.applyTriple(Double.POSITIVE_INFINITY);
        double testingNegativeInfinity = operation.applyTriple(Double.NEGATIVE_INFINITY);
        assertTrue(Double.isInfinite(testingPositiveInfinity));
        assertTrue(Double.isInfinite(testingNegativeInfinity));
    }

    @Test
    public void testApplyTripleNaN() {
        IdenticalOperation operation = new IdenticalOperation();
        double testingNaN = operation.applyTriple(Double.NaN);
        assertTrue(Double.isNaN(testingNaN));
    }
}
