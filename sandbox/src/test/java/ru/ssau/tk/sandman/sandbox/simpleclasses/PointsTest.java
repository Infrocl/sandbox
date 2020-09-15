package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointsTest {

    public static double ACCURACY = 0.00005;

    @Test
    public void testSum() {
        Point firstPoint = new Point(1, 2.77, -3.1);
        Point secondPoint = new Point(-5.02, 0, -2.6);
        Point resultPoint = Points.sum(firstPoint, secondPoint);
        double newX = firstPoint.x + secondPoint.x;
        double newY = firstPoint.y + secondPoint.y;
        double newZ = firstPoint.z + secondPoint.z;

        assertEquals(resultPoint.x, newX, ACCURACY);
        assertEquals(resultPoint.y, newY, ACCURACY);
        assertEquals(resultPoint.z, newZ, ACCURACY);
    }

    @Test
    public void testSubstruct() {
        Point firstPoint = new Point(-1, 2.77, -3.1);
        Point secondPoint = new Point(-5.02, 0, 2.6);
        Point resultPoint = Points.substruct(firstPoint, secondPoint);
        double newX = firstPoint.x - secondPoint.x;
        double newY = firstPoint.y - secondPoint.y;
        double newZ = firstPoint.z - secondPoint.z;

        assertEquals(resultPoint.x, newX, ACCURACY);
        assertEquals(resultPoint.y, newY, ACCURACY);
        assertEquals(resultPoint.z, newZ, ACCURACY);
    }

    @Test
    public void testMultiply() {
        Point firstPoint = new Point(-1, 2.77, -3.1);
        Point secondPoint = new Point(-5.02, 0, 2.6);
        Point resultPoint = Points.multiply(firstPoint, secondPoint);
        double newX = firstPoint.x * secondPoint.x;
        double newY = firstPoint.y * secondPoint.y;
        double newZ = firstPoint.z * secondPoint.z;

        assertEquals(resultPoint.x, newX, ACCURACY);
        assertEquals(resultPoint.y, newY, ACCURACY);
        assertEquals(resultPoint.z, newZ, ACCURACY);
    }

    @Test
    public void testDivide() {
        Point firstPoint = new Point(-1, 2.77, -3.1);
        Point secondPoint = new Point(-5.02, 5, 2.6);
        Point resultPoint = Points.divide(firstPoint, secondPoint);
        double newX = firstPoint.x / secondPoint.x;
        double newY = firstPoint.y / secondPoint.y;
        double newZ = firstPoint.z / secondPoint.z;

        assertEquals(resultPoint.x, newX, ACCURACY);
        assertEquals(resultPoint.y, newY, ACCURACY);
        assertEquals(resultPoint.z, newZ, ACCURACY);
    }

    @Test
    public void testEnlarge() {
        Point point = new Point(2, 5, 0);
        double number = 2.0;
        Point secondPoint = Points.enlarge(point, number);

        assertEquals(secondPoint.x, point.x * number, ACCURACY);
        assertEquals(secondPoint.y, point.y * number, ACCURACY);
        assertEquals(secondPoint.z, point.z * number, ACCURACY);
    }

    @Test
    public void testOpposite() {
        Point firstPoint = new Point(1, -1, 0);
        Point secondPoint = Points.opposite(firstPoint);

        assertEquals(secondPoint.x, -firstPoint.x, ACCURACY);
        assertEquals(secondPoint.y, -firstPoint.y, ACCURACY);
        assertEquals(secondPoint.z, -firstPoint.z, ACCURACY);
    }

    @Test
    public void testInverse() {
        Point firstPoint = new Point(-1, 5, 0.5);
        Point secondPoint = Points.inverse(firstPoint);

        assertEquals(secondPoint.x, 1 / firstPoint.x, ACCURACY);
        assertEquals(secondPoint.y, 1 / firstPoint.y, ACCURACY);
        assertEquals(secondPoint.z, 1 / firstPoint.z, ACCURACY);
    }

    @Test
    public void testLenght() {
        Point point = new Point(0, 3.5, -9);
        double testingLenght = Points.lenght(point);
        double lenght = Math.sqrt(Math.pow(point.x, 2) + Math.pow(point.y, 2) + Math.pow(point.z, 2));

        assertEquals(testingLenght, lenght, ACCURACY);
    }

    @Test
    public void testScalarProduct() {
        Point firstVector = new Point(0, -3.7, 10);
        Point secondVector = new Point(-11, 3, 5.1);
        double testingScalarProduct = Points.scalarProduct(firstVector, secondVector);
        double scalarProduct = 39.9;

        assertEquals(testingScalarProduct, scalarProduct, ACCURACY);
    }

    @Test
    public void testVectorProduct() {
        Point firstVector = new Point(0, -3.7, 10);
        Point secondVector = new Point(-11, 3, 5.1);
        Point testingVectorProduct = Points.vectorProduct(firstVector, secondVector);
        Point vectorProduct = new Point(-48.87, -110, -40.7);

        assertEquals(testingVectorProduct.x, vectorProduct.x, ACCURACY);
        assertEquals(testingVectorProduct.y, vectorProduct.y, ACCURACY);
        assertEquals(testingVectorProduct.z, vectorProduct.z, ACCURACY);
    }
}
