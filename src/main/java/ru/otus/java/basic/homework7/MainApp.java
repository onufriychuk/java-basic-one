package ru.otus.java.basic.homework7;

public class MainApp {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        int[][] arr2 = {
                {5,6,8},
                {4,2,7,5,2},
                {9,0,2,1,5,6},
                {2,3}
        };
        fillArray(arr);
        printArray(arr);

        sumOfPositiveElements(arr); //1

        printSquareArray(7); //2

        setZeroDiagArr(arr); //3
        printArray(arr);

        System.out.println("Максимальное значение: " + findMax(arr)); //4

        System.out.println("Сумма элементов 2 строки: " + sumSecondRow(arr)); //5

        columnSum(arr2,7);
    }

    // * реализовать метод, который считает сумму элементов i-го столбца
    public static void columnSum(int[][] arr, int column) {
        int sum = 0;
        boolean isSumChanged = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length < column) {
                continue;
            }
            sum += arr[i][column-1];
            isSumChanged = true;
        }
        if (!isSumChanged) {
            System.out.println("Не найден ни один элемент столбца " + column);
        } else {
            System.out.println("Сумма элементов столбца " + column + " равна: " + sum);
        }
    }

    //Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный
    //массив, метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
    public static void sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Сумма положительных элементов массива: " + sum);
    }

    //Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из
    //символов * со сторонами соответствующей длины;
    public static void printSquareArray(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Реализовать метод, принимающий в качестве аргумента квадратный двумерный целочисленный массив, и
    //зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе).
    //Проверять количество строк и столбцов не требуется, условие “квадратности” нужно чтобы упростить вам
    //работу с диагоналями;
    public static void setZeroDiagArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 0;
            arr[i][arr.length - 1 - i] = 0;
        }
    }

    //Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    //Реализуйте метод, который считает сумму элементов второй строки или столбца двумерного массива (по
    //вашему выбору), если второй строки/столбца не существует, то в качестве результата необходимо вернуть -1
    public static int sumSecondRow(int[][] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int sum = arr[1][0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[1][i];
        }
        return sum;
    }


    //вспомогательные методы
    public static void fillArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 200 - 100);
            }
        }
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
