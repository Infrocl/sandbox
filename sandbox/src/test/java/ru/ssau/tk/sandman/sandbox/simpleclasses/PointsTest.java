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
}
