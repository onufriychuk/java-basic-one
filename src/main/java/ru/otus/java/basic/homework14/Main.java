package ru.otus.java.basic.homework14;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] wrongSizeArray = {
            {"1", "2", "3", "4", "5"},
            {"2", "3", "4", "5", "1"},
            {"3", "4", "5", "1", "2"},
            {"4", "5", "1", "2", "3"},
            {"5", "1", "2", "3", "4"}
        };
        String[][] wrongDataArray = {
                {"1", "2+", "3", "4"},
                {"2+", "3", "4", "1"},
                {"3", "4", "1", "2+"},
                {"4", "1", "2+", "3"}
        };
        String[][] array = {
                {"1", "2", "3", "4"},
                {"2", "3", "4", "1"},
                {"3", "4", "1", "2"},
                {"4", "1", "2", "3"}
        };
//        System.out.println(stringArraySum(wrongSizeArray));
        System.out.println("Сумма элементов массива: " + stringArraySum(wrongDataArray));
        System.out.println("Сумма элементов массива: " + stringArraySum(array));
    }

    public static int stringArraySum(String[][] array) {
        if (array.length != 4 || array[0].length != 4) {
            throw new AppArraySizeException("Неверный размер массива");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Не могу преобразовать строку в число в a[" + i + "][" + j + "]");
                } finally {
                    array[i][j] = "0";
                    sum += Integer.parseInt(array[i][j]);
                    continue;
                }
            }
        }
        return sum;
    }
}
