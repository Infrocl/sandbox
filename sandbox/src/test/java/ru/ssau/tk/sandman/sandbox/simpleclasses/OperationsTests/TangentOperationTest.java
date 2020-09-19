package ru.ssau.tk.sandman.sandbox.simpleclasses.OperationsTests;

import org.testng.annotations.Test;
import ru.ssau.tk.sandman.sandbox.simpleclasses.Operations.TangentOperation;

import static org.testng.Assert.*;

public class TangentOperationTest {
    public static double ACCURACY = 0.00005;

    @Test
    public void testApplyNumber() {
        TangentOperation tangent = new TangentOperation();
        assertEquals(tangent.apply(Math.PI / 3), 1.73205, ACCURACY);
        assertEquals(tangent.apply(0), 0, ACCURACY);
        assertEquals(tangent.apply(-Math.PI), 0, ACCURACY);
    }

    @Test
    public void testApplyInfinity() {
        TangentOperation tangent = new TangentOperation();
        assertThrows(ArithmeticException.class, () -> tangent.apply(Double.POSITIVE_INFINITY));
        assertThrows(ArithmeticException.class, () -> tangent.apply(Double.NEGATIVE_INFINITY));
    }

    @Test
    public void testApplyNan() {
        TangentOperation tangent = new TangentOperation();
        assertThrows(ArithmeticException.class, () -> tangent.apply(Double.NaN));
    }

    @Test
    public void testApplyTriple() {
        TangentOperation tangent = new TangentOperation();
        assertEquals(tangent.applyTriple(Math.PI), 0, ACCURACY);
        assertEquals(tangent.applyTriple(-Math.PI / 3), -0.13649, ACCURACY);
    }

    @Test
    public void testApplyTripleInfinity() {
        TangentOperation tangent = new TangentOperation();
        assertThrows(ArithmeticException.class, () -> tangent.applyTriple(Double.POSITIVE_INFINITY));
        assertThrows(ArithmeticException.class, () -> tangent.applyTriple(Double.NEGATIVE_INFINITY));
    }

    @Test
    public void testApplyTripleNan() {
        TangentOperation tangent = new TangentOperation();
        assertThrows(ArithmeticException.class, () -> tangent.applyTriple(Double.NaN));
    }
}
