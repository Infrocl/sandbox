package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.jetbrains.annotations.NotNull;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointsTest {
    public static double ACCURACY = 0.00005;

    public boolean equalsApproximately(double firstNumber, double secondNumber) {
        if (Math.abs(firstNumber - secondNumber) <= ACCURACY) {
            return true;
        }
        return false;
    }

    private boolean equalsApproximately(@NotNull Point firstPoint, @NotNull Point secondPoint) {
        if (equalsApproximately(firstPoint.x, secondPoint.x) && equalsApproximately(firstPoint.y, secondPoint.y) && equalsApproximately(firstPoint.z, secondPoint.z)) {
            return true;
        }
        return false;
    }

    @Test
    public void testEqualsApproximatelyDouble() {
        double firstNumber = -1;
        double secondNumber = -1.1;
        double thirdNumber = -1.0000000005;
        assertFalse(equalsApproximately(firstNumber, secondNumber));
        assertTrue(equalsApproximately(firstNumber, thirdNumber));
    }

    @Test
    public void testEqualsApproximatelyPoint() {
        Point firstPoint = new Point(0, 3.0000005, 10.1);
        Point secondPoint = new Point(0.00000008, 3.0005, -10.1);
        Point thirdPoint = new Point(0.0000000008, 3, 10.10000005);
        assertTrue(equalsApproximately(firstPoint, thirdPoint));
        assertFalse(equalsApproximately(firstPoint, secondPoint));
    }

    @Test
    public void testSum() {
        Point firstPoint = new Point(1, 2.77, -3.1);
        Point secondPoint = new Point(-5.02, 0, -2.6);
        Point resultPoint = new Point(-4.02, 2.77, -5.7);
        equalsApproximately(Points.sum(firstPoint, secondPoint), resultPoint);
    }

    @Test
    public void testSubtract() {
        Point firstPoint = new Point(-1, 2.77, -3.1);
        Point secondPoint = new Point(-5.02, 0, 2.6);
        Point resultPoint = new Point(4.02, 2.77, -5.7);
        equalsApproximately(Points.subtract(firstPoint, secondPoint), resultPoint);
    }

    @Test
    public void testMultiply() {
        Point firstPoint = new Point(-1, 2.77, -3.1);
        Point secondPoint = new Point(-5.02, 0, 2.6);
        Point resultPoint = new Point(5.02, 0, 8.06);
        equalsApproximately(resultPoint, Points.multiply(firstPoint, secondPoint));
    }

    @Test
    public void testDivide() {
        Point firstPoint = new Point(-1, 2.77, -3.1);
        Point secondPoint = new Point(-5.02, 5, 2.6);
        Point resultPoint = new Point(firstPoint.x / secondPoint.x, firstPoint.y / secondPoint.y, firstPoint.z / secondPoint.z);
        equalsApproximately(resultPoint, Points.divide(firstPoint, secondPoint));
    }

    @Test
    public void testEnlarge() {
        Point point = new Point(2, 5, 0);
        double number = -2.0;
        Point secondPoint = new Point(-4, -10, 0);
        equalsApproximately(secondPoint, Points.enlarge(point, number));
    }

    @Test
    public void testOpposite() {
        Point firstPoint = new Point(1, -1, 0);
        Point secondPoint = new Point(-1, 1, 0);
        equalsApproximately(Points.opposite(firstPoint), secondPoint);
    }

    @Test
    public void testInverse() {
        Point firstPoint = new Point(-1, 5, 0.5);
        Point secondPoint = new Point(1 / firstPoint.x, 1 / firstPoint.y, 1 / firstPoint.z);
        equalsApproximately(Points.inverse(firstPoint), secondPoint);
    }

    @Test
    public void testLength() {
        Point point = new Point(0, 3.5, -9);
        double length = Math.sqrt(Math.pow(point.x, 2) + Math.pow(point.y, 2) + Math.pow(point.z, 2));
        assertEquals(Points.length(point), length, ACCURACY);
    }

    @Test
    public void testScalarProduct() {
        Point firstVector = new Point(0, -3.7, 10);
        Point secondVector = new Point(-11, 3, 5.1);
        double scalarProduct = 39.9;
        assertEquals(Points.scalarProduct(firstVector, secondVector), scalarProduct, ACCURACY);
    }

    @Test
    public void testVectorProduct() {
        Point firstVector = new Point(0, -3.7, 10);
        Point secondVector = new Point(-11, 3, 5.1);
        Point vectorProduct = new Point(-48.87, -110, -40.7);
        equalsApproximately(Points.vectorProduct(firstVector, secondVector), vectorProduct);
    }
}
