package ru.otus.java.basic.homework3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер желаемого действия: 1 - greetings, 2 - checkSign, 3 - selectColor, 4 - compareNumbers, 5 - addOrSubtractAndPrint, 0 - для выхода");

        while (scanner.hasNext()) {
            int userChoise = scanner.nextInt();
            if (userChoise == 1) {
                greetings();
            } else if (userChoise == 2) {
                checkSign((int) (Math.random() * 200 - 100), (int) (Math.random() * 200 - 100), (int) (Math.random() * 200 - 100));
            } else if (userChoise == 3) {
                selectColor();
            } else if (userChoise == 4) {
                compareNumbers();
            } else if (userChoise == 5) {
                addOrSubstractAndPrint((int) (Math.random() * 57), (int) (Math.random() * 37), Math.random() > 0.5);
            } else if (userChoise == 0) {
                break;
            } else {
                System.out.println("Вы ввели несуществующее значение, попробуйте снова");
            }
        }
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        System.out.println("Суммируем числа " + a + ", " + b + " и " + c);
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 777;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 354;
        int b = -586;
        System.out.println("Сравниваем числа a=" + a + " и b=" + b);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubstractAndPrint(int initValue, int delta, boolean increment) {
        System.out.println("Начальное значение: " + initValue + ", дельта: " + delta + ". Выполняем операцию " + (increment?"сложения":"вычитания"));
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
