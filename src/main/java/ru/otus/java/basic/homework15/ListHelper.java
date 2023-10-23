package ru.otus.java.basic.homework15;

import ru.otus.java.basic.homework15.stuff.Employee;

import java.util.ArrayList;
import java.util.List;

public class ListHelper {
    public static List<Integer> generateList(int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = max; i >= min; i--) {
            list.add(i);
        }
        return list;
    }

    public static int sumList(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            if (i > 5) {
                sum += i;
            }
        }
        return sum;
    }

    public static void fillList(int x, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, x);
        }
    }

    public static void increaseList(int x, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + x);
        }
    }
}
