package ru.otus.java.basic.homework5;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int[] arr1 = {5, 8, 9, 0, 3, -2, 5, 7, 9};
        int[] arr2 = {1, 2, 2, 3, 4, 5, 5};
        int[] arr3 = {1, 0, 1};
        int[] arr4 = {2, 3, 2, 4};

//        sumArrays(arr1, arr2, arr3, arr4); //*1
//        arrEquillibriumPointer(arr1); //*2
//        arraySortChecker(arr2, true); //*3
//        reverseArr(arr1); //*4
//        printString("Hello", 5);
//        sumArr(arr);
//        fillArr(5, arr2 );
//        increaseArr(5, arr);
//        compareHalfArr(arr);
    }

    //задача *1, получить массив, равный сумме массивов
    public static void sumArrays(int[]... arrays) {
        int maxLength = 0;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].length > maxLength) {
                maxLength = arrays[i].length;
            }
        }
        int[] outArr = new int[maxLength];

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                outArr[j] += arrays[i][j];
            }
        }
        System.out.println(Arrays.toString(outArr));
    }

    //задача *2, есть ли точка в массиве, в которой суммы левой и правой частей равны
    public static void arrEquillibriumPointer(int[] arr) {
        int sum = 0;
        int[] arrayOfSum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrayOfSum[i] = sum + arr[i];
            sum += arr[i];
        }
        for (int i = 0; i < arrayOfSum.length; i++) {
            if (arrayOfSum[i] == (sum - arrayOfSum[i])) {
                System.out.println("Удача! Для этого массива есть такая точка!");
                return;
            }
        }
        System.out.println("Для этого массива решения нет.");
    }

    //задача *3, проверить, верно ли отсортирован массив
    public static void arraySortChecker(int[] arr, boolean asc) {
        boolean nonSorted = false;
        for (int i = 1; i < arr.length; i++) {
            if (asc) {
                if (arr[i] < arr[i - 1]) {
                    nonSorted = true;
                    break;
                }
            } else {
                if (arr[i] > arr[i - 1]) {
                    nonSorted = true;
                    break;
                }
            }
        }
        if (nonSorted) {
            System.out.println("Массив не отсортирован");
        } else {
            System.out.println("Массив отсортирован верно");
        }
    }

    //задача *4, перевернуть массив, не используя вспомогательных массивов
    public static void reverseArr(int[] arr) {
        int value = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            value = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = value;
        }
        System.out.println(Arrays.toString(arr));
    }

    //далее "простые задачи"

    public static void printString(String str, int copies) {
        for (int i = 0; i < copies; i++) {
            System.out.println(str);
        }
    }

    public static void sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillArr(int k, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = k;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void increaseArr(int k, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += k;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void compareHalfArr(int[] arr) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) {
                leftSum += arr[i];
            } else {
                rightSum += arr[i];
            }
        }
        if (leftSum > rightSum) {
            System.out.println("Сумма левой половины (" + leftSum + ") больше суммы правой половины (" + rightSum + ")");
        } else if (leftSum < rightSum) {
            System.out.println("Сумма правой половины (" + rightSum + ") больше суммы левой половины (" + leftSum + ")");
        } else {
            System.out.println("Суммы половин(" + leftSum + " и " + rightSum + ") равны");
        }
    }
}
