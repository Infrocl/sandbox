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
}
