package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class PointsTest {
    @Test
    public void testSum(){
        Point firstPoint = new Point (1, 2.77, -3.1);
        Point secondPoint = new Point (-5.02, 0, -2.6);
        Point resultPoint = Points.sum(firstPoint, secondPoint);

        double newX = firstPoint.x + secondPoint.x;
        double newY = firstPoint.y + secondPoint.y;
        double newZ = firstPoint.z + secondPoint.z;

        assertEquals(resultPoint.x, newX);
        assertEquals(resultPoint.y, newY);
        assertEquals(resultPoint.z, newZ);
    }

    @Test
    public void testSubstruct(){
        Point firstPoint = new Point (-1, 2.77, -3.1);
        Point secondPoint = new Point (-5.02, 0, 2.6);
        Point resultPoint = Points.substruct(firstPoint, secondPoint);

        double newX = firstPoint.x - secondPoint.x;
        double newY = firstPoint.y - secondPoint.y;
        double newZ = firstPoint.z - secondPoint.z;

        assertEquals(resultPoint.x, newX);
        assertEquals(resultPoint.y, newY);
        assertEquals(resultPoint.z, newZ);
    }

    @Test
    public void testMultiply(){
        Point firstPoint = new Point (-1, 2.77, -3.1);
        Point secondPoint = new Point (-5.02, 0, 2.6);
        Point resultPoint = Points.multiply(firstPoint, secondPoint);

        double newX = firstPoint.x * secondPoint.x;
        double newY = firstPoint.y * secondPoint.y;
        double newZ = firstPoint.z * secondPoint.z;

        assertEquals(resultPoint.x, newX);
        assertEquals(resultPoint.y, newY);
        assertEquals(resultPoint.z, newZ);
    }

    @Test
    public void testDivide(){
        Point firstPoint = new Point (-1, 2.77, -3.1);
        Point secondPoint = new Point (-5.02, 5, 2.6);
        Point resultPoint = Points.divide(firstPoint, secondPoint);

        double newX = firstPoint.x / secondPoint.x;
        double newY = firstPoint.y / secondPoint.y;
        double newZ = firstPoint.z / secondPoint.z;

        assertEquals(resultPoint.x, newX);
        assertEquals(resultPoint.y, newY);
        assertEquals(resultPoint.z, newZ);
    }

    @Test
    public void testEnlarge(){
        Point point = new Point(2, 5, 0);
        double number = 2.0;
        Point secondPoint = Points.enlarge(point, number);

        assertEquals(secondPoint.x, point.x * number);
        assertEquals(secondPoint.y, point.y * number);
        assertEquals(secondPoint.z, point.z * number);
    }

    @Test
    public void testOpposite(){
        Point firstPoint = new Point (1, -1, 0);
        Point secondPoint = Points.opposite(firstPoint);

        assertEquals(secondPoint.x, -firstPoint.x);
        assertEquals(secondPoint.y, -firstPoint.y);
        assertEquals(secondPoint.z, -firstPoint.z);
    }

    @Test
    public void testInverse(){
        Point firstPoint = new Point(-1, 5, 0.5);
        Point secondPoint = Points.inverse(firstPoint);

        assertEquals(secondPoint.x, 1/ firstPoint.x);
        assertEquals(secondPoint.y, 1/ firstPoint.y);
        assertEquals(secondPoint.z, 1/firstPoint.z);
    }
}
