package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.testng.annotations.Test;
import ru.ssau.tk.sandman.sandbox.simpleclasses.Pointing.NamedPoint;

import static org.testng.Assert.*;

public class NamedPointTest {
    @Test
    public void testReset() {
        NamedPoint point = new NamedPoint();
        point.reset();
        assertEquals(point.getName(), "Absent");
    }

    @Test
    public void testConstruct() {
        NamedPoint point = new NamedPoint(1, 2, 3);
        assertEquals(point.x, 1.0);
        assertEquals(point.y, 2.0);
        assertEquals(point.z, 3.0);
        assertNull(point.getName());
        NamedPoint secondPoint = new NamedPoint(1, -1, 0, null);
        assertNull(secondPoint.getName());
        assertEquals(secondPoint.x, 1.0);
        assertEquals(secondPoint.y, -1.0);
        assertEquals(secondPoint.z, 0.0);
        NamedPoint thirdPoint = new NamedPoint();
        assertEquals(thirdPoint.x, 0.0);
        assertEquals(thirdPoint.y, 0.0);
        assertEquals(thirdPoint.z, 0.0);
        assertEquals(thirdPoint.getName(), "Origin");
    }

    @Test
    public void testSetGetName() {
        String name = "A";
        NamedPoint point = new NamedPoint();
        point.setName(name);
        assertEquals(point.getName(), name);
        point.setName(null);
        assertNull(point.getName(), null);
    }
}

