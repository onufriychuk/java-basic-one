package ru.otus.java.basic.homework15;

import ru.otus.java.basic.homework15.stuff.Employee;
import ru.otus.java.basic.homework15.stuff.Stuff;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = ListHelper.generateList(1, 10);
        System.out.println(list);
        System.out.println(ListHelper.sumList(list));
        ListHelper.fillList(5, list);
        System.out.println(list);
        ListHelper.increaseList(2, list);
        System.out.println(list);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Пётр", 11));
        employees.add(new Employee("Владимир", 36));
        employees.add(new Employee("Геннадий", 5));
        employees.add(new Employee("Артём", 41));

        System.out.println(Stuff.getEmployeesNames(employees));
        System.out.println(Stuff.getEmployeesNamesOlderThan(employees, 22));
        System.out.println(Stuff.isAgeAverageMoreThan(employees, 23));
        System.out.println(Stuff.getYoungestEmployee(employees));
    }
}
