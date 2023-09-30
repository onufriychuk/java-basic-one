package ru.otus.java.basic.homework10;

public class User {
    String surname;
    String firstName;
    String secondName;
    int yearOfBirth;
    String email;

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
