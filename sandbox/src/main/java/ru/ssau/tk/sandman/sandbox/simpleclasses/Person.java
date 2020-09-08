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

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setPassportId(int passportId){
        this.passportId = passportId;
    }

    public Person(){}

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(int passportId){
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName, int passportId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    public static void main(String[] args){
        Person firstPerson = new Person();
        Person secondPerson = new Person("Dima", "Ivanov");
        Person thirdPerson = new Person("Vasya", "Popov", 123);
        Person fourthPerson = new Person(345);

        System.out.println(fourthPerson.getPassportId());
        System.out.println(secondPerson.getFirstName());
    }
}


