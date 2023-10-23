package ru.otus.java.basic.homework15.stuff;

public class Employee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }
}
