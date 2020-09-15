package ru.ssau.tk.sandman.sandbox.simpleclasses;

public class Person {
    private String firstName;
    private String lastName;
    private int passportId;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(int passportId) {
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    /*
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        int number = 5;
        checkInt(number); //Статический метод, который выводит number = 10 вне зависимости от передаваемого значения
        checkPerson(person); //Статический метод, который выводит имя "Олег" вне зависимости от передаваемого значения
        System.out.println(number); //Число и имя не изменились, т.к. передача аргументов была по значению
        System.out.println(person.getFirstName());
    }
*/
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        checkAnotherPerson(person);
        System.out.println(person.getFirstName()); //Значение поля не изменилось, объект на месте, метод работал с копией
    }

    private static void checkInt(int number) {
        number = 10;
        System.out.println(number);
    }

    private static void checkPerson(Person person) {
        person.setFirstName("Oleg");
        System.out.println(person.getFirstName());
    }

    private static void checkAnotherPerson(Person person) {
        person = new Person(); //копия объекта person потерялась навсегда
        person.setFirstName("Ignat");
        System.out.println(person.getFirstName());
    }

}


