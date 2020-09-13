package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class PointsTest {

    public static double accuracy = 0.00005;

    @Test
    public void testSum(){
        Point firstPoint = new Point (1, 2.77, -3.1);
        Point secondPoint = new Point (-5.02, 0, -2.6);
        Point resultPoint = Points.sum(firstPoint, secondPoint);

        double newX = firstPoint.x + secondPoint.x;
        double newY = firstPoint.y + secondPoint.y;
        double newZ = firstPoint.z + secondPoint.z;

        assertEquals(resultPoint.x, newX, accuracy);
        assertEquals(resultPoint.y, newY, accuracy);
        assertEquals(resultPoint.z, newZ, accuracy);
    }

    @Test
    public void testSubstruct(){
        Point firstPoint = new Point (-1, 2.77, -3.1);
        Point secondPoint = new Point (-5.02, 0, 2.6);
        Point resultPoint = Points.substruct(firstPoint, secondPoint);

        double newX = firstPoint.x - secondPoint.x;
        double newY = firstPoint.y - secondPoint.y;
        double newZ = firstPoint.z - secondPoint.z;

        assertEquals(resultPoint.x, newX, accuracy);
        assertEquals(resultPoint.y, newY, accuracy);
        assertEquals(resultPoint.z, newZ, accuracy);
    }

    @Test
    public void testMultiply(){
        Point firstPoint = new Point (-1, 2.77, -3.1);
        Point secondPoint = new Point (-5.02, 0, 2.6);
        Point resultPoint = Points.multiply(firstPoint, secondPoint);

        double newX = firstPoint.x * secondPoint.x;
        double newY = firstPoint.y * secondPoint.y;
        double newZ = firstPoint.z * secondPoint.z;

        assertEquals(resultPoint.x, newX, accuracy);
        assertEquals(resultPoint.y, newY, accuracy);
        assertEquals(resultPoint.z, newZ, accuracy);
    }

    @Test
    public void testDivide(){
        Point firstPoint = new Point (-1, 2.77, -3.1);
        Point secondPoint = new Point (-5.02, 5, 2.6);
        Point resultPoint = Points.divide(firstPoint, secondPoint);

        double newX = firstPoint.x / secondPoint.x;
        double newY = firstPoint.y / secondPoint.y;
        double newZ = firstPoint.z / secondPoint.z;

        assertEquals(resultPoint.x, newX, accuracy);
        assertEquals(resultPoint.y, newY, accuracy);
        assertEquals(resultPoint.z, newZ, accuracy);
    }

    @Test
    public void testEnlarge(){
        Point point = new Point(2, 5, 0);
        double number = 2.0;
        Point secondPoint = Points.enlarge(point, number);

        assertEquals(secondPoint.x, point.x * number, accuracy);
        assertEquals(secondPoint.y, point.y * number, accuracy);
        assertEquals(secondPoint.z, point.z * number, accuracy);
    }

    @Test
    public void testOpposite(){
        Point firstPoint = new Point (1, -1, 0);
        Point secondPoint = Points.opposite(firstPoint);

        assertEquals(secondPoint.x, -firstPoint.x, accuracy);
        assertEquals(secondPoint.y, -firstPoint.y, accuracy);
        assertEquals(secondPoint.z, -firstPoint.z, accuracy);
    }

    @Test
    public void testInverse(){
        Point firstPoint = new Point(-1, 5, 0.5);
        Point secondPoint = Points.inverse(firstPoint);

        assertEquals(secondPoint.x, 1/ firstPoint.x, accuracy);
        assertEquals(secondPoint.y, 1/ firstPoint.y, accuracy);
        assertEquals(secondPoint.z, 1/firstPoint.z, accuracy);
    }

    @Test
    public void testLenght(){
        Point point = new Point(0, 3.5, -9);
        double testingLenght = Points.lenght(point);
        double lenght = Math.sqrt(Math.pow(point.x, 2) + Math.pow(point.y, 2) + Math.pow(point.z, 2));

        assertEquals(testingLenght, lenght, accuracy);
    }

    @Test
    public void testScalarProduct(){
        Point firstVector = new Point(0, -3.7, 10);
        Point secondVector = new Point(-11, 3, 5.1);

        double testingScalarProduct = Points.scalarProduct(firstVector, secondVector);
        double scalarProduct = firstVector.x * secondVector.x + firstVector.y * secondVector.y + firstVector.z * secondVector.z;

        assertEquals(testingScalarProduct, scalarProduct, accuracy);
    }

    @Test
    public void testVectorProduct(){
        Point firstVector = new Point(0, -3.7, 10);
        Point secondVector = new Point(-11, 3, 5.1);

        Point testingVectorProduct = Points.vectorProduct(firstVector, secondVector);
        Point vectorProduct = new Point(firstVector.y * secondVector.z - firstVector.z * secondVector.y, firstVector.z * secondVector.x - firstVector.x * secondVector.z, firstVector.x * secondVector.y - firstVector.y + secondVector.x);

        assertEquals(testingVectorProduct.x, vectorProduct.x, accuracy);
        assertEquals(testingVectorProduct.y, vectorProduct.y, accuracy);
        assertEquals(testingVectorProduct.z, vectorProduct.z, accuracy);
    }

}
