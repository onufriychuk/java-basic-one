package ru.otus.java.basic.homework5;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int[] arr1 = {5, 8, 9, 0, 3, -2, 5, 7, 9};
        int[] arr2 = {1, 2, 2, 3, 4, 5, 5};
        int[] arr3 = {1, 0, 1};
        int[] arr4 = {2, 3, 2, 4};

        arrEquillibriumPointer(arr1); //*1
//        sumArrays(arr1, arr2, arr3, arr4); //*2
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
        int digit = 0;
        int maxLength = 0;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].length > maxLength) {
                maxLength = arrays[i].length;
            }
        }
        int[] outArr = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < arrays.length; j++) {
                if (arrays[j].length > i) {
                    outArr[i] += arrays[j][i];
                }
            }
        }
        System.out.println(Arrays.toString(outArr));
    }

    //задача *2, есть ли точка в массиве, в которой суммы левой и правой частей равны
    public static void arrEquillibriumPointer(int[] arr) {
        int lPointer = 0;
        int rPointer = arr.length - 1;
        int lSum = arr[lPointer];
        int rSum = arr[rPointer];
        for (int i = 0; i < arr.length - 1; i++) {
            //System.out.println("lP=" + lPointer + ", rP=" + rPointer + ", lS=" + lSum + ", rS=" + rSum);
            if (rPointer - lPointer == 1) {
                if (lSum == rSum) {
                    System.out.println("Удача! Для этого массива есть такая точка!");
                } else {
                    System.out.println("Для этого массива решения нет.");
                }
            } else if (rPointer == lPointer && arr[lPointer] == 0) {
                System.out.println("Ого! Для этого массива есть несколько решений!");
                break;
            }
            if (lSum < rSum) {
                lPointer++;
                lSum += arr[lPointer];
            } else if (lSum > rSum) {
                rPointer--;
                rSum += arr[rPointer];
            } else {
                lPointer++;
                rPointer--;
                lSum += arr[lPointer];
                rSum += arr[rPointer];
            }
        }
    }

    //задача *3, проверить, верно ли отсортирован массив
    public static void arraySortChecker(int[] arr, boolean asc) {
        boolean flag = false;
        for (int i = 1; i < arr.length; i++) {
            if (asc) {
                if (arr[i] < arr[i - 1]) {
                    flag = true;
                    break;
                }
            } else {
                if (arr[i] > arr[i - 1]) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("Массив не отсортирован");
        } else {
            System.out.println("Массив отсортирован верно");
        }
    }

    //задача *4, перевернуть массив, не используя вспомогательных массивов
    public static void reverseArr(int[] arr) {
        int lPointer = 0;
        int rPointer = arr.length;
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
