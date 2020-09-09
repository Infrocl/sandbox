package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    @Test
    public void testGetSet(){
        Person firstPerson = new Person();
        Person secondPerson = new Person();
        String name = "Jane";

        firstPerson.setFirstName(name);
        firstPerson.setLastName("");
        firstPerson.setPassportId(789);

        secondPerson.setFirstName("");
        secondPerson.setLastName("Sit");
        secondPerson.setPassportId(0);

        assertEquals(firstPerson.getFirstName(), name);
        assertEquals(firstPerson.getLastName(), "");
        assertEquals(firstPerson.getPassportId(), 789 );

        assertEquals(secondPerson.getFirstName(),"");
        assertEquals(secondPerson.getLastName(), "Sit");
        assertEquals(secondPerson.getPassportId(), 0);
    }

}