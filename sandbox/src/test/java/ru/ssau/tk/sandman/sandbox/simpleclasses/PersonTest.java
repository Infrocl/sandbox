package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    @Test
    public void testFirstName() {
        Person firstPerson = new Person();
        String name = "Kira";

        assertNull(firstPerson.getFirstName());
        firstPerson.setFirstName(name);
        assertEquals(firstPerson.getFirstName(), name);
        firstPerson.setFirstName(null);
        assertNull(firstPerson.getFirstName());
    }

    @Test
    public void testLastName() {
        Person firstPerson = new Person();
        String lastName = "Petrova";

        assertNull(firstPerson.getLastName());
        firstPerson.setLastName(lastName);
        assertEquals(firstPerson.getLastName(), lastName);
        firstPerson.setLastName(null);
        assertNull(firstPerson.getLastName());
    }

    @Test
    public void testPassportId() {
        Person firstPerson = new Person();
        int id = 255;

        assertEquals(firstPerson.getPassportId(), 0);
        firstPerson.setPassportId(id);
        assertEquals(firstPerson.getPassportId(), id);
    }

    @Test
    public void testGender() {
        Person person = new Person();
        person.setGender(Person.Gender.MALE);
        assertEquals(person.getGender(), Person.Gender.MALE);
        person.setGender(null);
        assertNull(person.getGender());
    }

    @Test
    public void testNameConstructor() {
        Person person = new Person("First name", "Last name", Person.Gender.FEMALE);
        Person secondPerson = new Person(null, null, null);

        assertEquals(person.getFirstName(), "First name");
        assertEquals(person.getLastName(), "Last name");
        assertEquals(person.getGender(), Person.Gender.FEMALE);
        assertNull(secondPerson.getFirstName());
        assertNull(secondPerson.getLastName());
        assertNull(secondPerson.getGender());
    }

    @Test
    public void testPassportIdConstructor() {
        Person person = new Person(358);
        assertEquals(person.getPassportId(), 358);
    }

    @Test
    public void testFullConstructor() {
        Person person = new Person("First name", "Last name", 358, Person.Gender.MALE);
        Person secondPerson = new Person(null, null, 21, null);

        assertEquals(person.getFirstName(), "First name");
        assertEquals(person.getLastName(), "Last name");
        assertEquals(person.getPassportId(), 358);
        assertEquals(person.getGender(), Person.Gender.MALE);
        assertNull(secondPerson.getFirstName());
        assertNull(secondPerson.getLastName());
        assertNull(secondPerson.getGender());
    }
}