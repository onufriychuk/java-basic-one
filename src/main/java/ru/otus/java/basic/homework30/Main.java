package ru.otus.java.basic.homework30;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public static int[] arrayModifiaction(int[] sourceArray) {
        for (int i = sourceArray.length - 1; i >= 0; i--) {
            if (sourceArray[i] == 1) {
                return Arrays.copyOfRange(sourceArray, i + 1, sourceArray.length);
            }
        }
        throw new RuntimeException();
    }

    public static boolean checkArray(int[] array) {
        boolean value1 = false;
        boolean value2 = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1 && array[i] != 2) {
                return false;
            } else if (array[i] == 1) {
                 value1 = true;
            } else if (array[i] == 2) {
                value2 = true;
            }
        }
        return value1 && value2;
    }
}
