package ru.otus.java.basic.homework10;

public class User {
    private String surname;
    private String firstName;
    private String secondName;
    private int yearOfBirth;
    private String email;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String surname, String firstName, String secondName, int yearOfBirth, String email) {
        this.surname = surname;
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public void print() {
        System.out.println("ФИО: " + this.surname + " " + this.firstName + " " + this.secondName);
        System.out.println("Год рождения: " + this.yearOfBirth);
        System.out.println("e-mail: " + this.email);
    }
}
