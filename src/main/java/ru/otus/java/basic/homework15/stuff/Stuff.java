package ru.otus.java.basic.homework15.stuff;

import java.util.ArrayList;
import java.util.List;

public class Stuff {
    public static List<String> getEmployeesNames(List<Employee> list) {
        List<String> names = new ArrayList<>();
        for (Employee i : list) {
            names.add(i.getName());
        }
        return names;
    }

    public static List<String> getEmployeesNamesOlderThan(List<Employee> list, int age) {
        List<String> employees = new ArrayList<>();
        for (Employee i : list) {
            if (i.getAge() >= age) {
                employees.add(i.getName());
            }
        }
        return employees;
    }

    public static boolean isAgeAverageMoreThan(List<Employee> list, int ageAverage) {
        int sum = 0;
        for (Employee i : list) {
            sum += i.getAge();
        }
        return (float) sum / list.size() > ageAverage;
    }

    public static Employee getYoungestEmployee(List<Employee> list) {
        int minAge = 1000;
        Employee youngest = null;
        for (Employee i : list) {
            if (i.getAge() < minAge) {
                minAge = i.getAge();
                youngest = i;
            }
        }
        return youngest;
    }
}
