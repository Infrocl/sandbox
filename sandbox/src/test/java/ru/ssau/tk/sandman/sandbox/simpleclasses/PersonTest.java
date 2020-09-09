package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    @Test
    public void testFirstName(){
        Person firstPerson = new Person();
        String name = "Kira";

        assertNull(firstPerson.getFirstName());
        firstPerson.setFirstName(name);
        assertEquals(firstPerson.getFirstName(), name);
        firstPerson.setFirstName(null);
        assertNull(firstPerson.getFirstName());
    }

    @Test
    public void testLastName(){
        Person firstPerson = new Person();
        String lastName = "Petrova";

        assertNull(firstPerson.getLastName());
        firstPerson.setLastName(lastName);
        assertEquals(firstPerson.getLastName(), lastName);
        firstPerson.setLastName(null);
        assertNull(firstPerson.getLastName());
    }

    @Test
    public void testPassportId(){
        Person firstPerson = new Person();
        int id = 255;

        assertEquals(firstPerson.getPassportId(), 0);
        firstPerson.setPassportId(id);
        assertEquals(firstPerson.getPassportId(), id);
    }
}