package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {
    @Test
    public void testReset() {
        NamedPoint point = new NamedPoint();
        point.reset();
        assertEquals(point.name, "Absent");
    }
}

