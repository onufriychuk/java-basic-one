package ru.otus.java.basic.homework30.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.otus.java.basic.homework30.Main;

public class MainTests {
    @Test
    public void testArrayModificationException() {
        int[] array = new int[]{3, 4};
        Assertions.assertThrows(RuntimeException.class, () -> Main.arrayModifiaction(array));
    }
    @Test
    public void testArrayModificationLast1() {
        int[] array = new int[]{1, 2, 2, 1, 2, 2, 1};
        Assertions.assertArrayEquals(new int[]{}, Main.arrayModifiaction(array));
    }
    @Test
    public void testArrayModification() {
        int[] array = new int[]{1, 2, 2, 1, 2, 2, 2};
        Assertions.assertArrayEquals(new int[]{2, 2, 2}, Main.arrayModifiaction(array));
    }
    @Test
    public void testCheckArray() {
        Assertions.assertTrue(Main.checkArray(new int[]{1, 2, 1, 2, 2}));
        Assertions.assertFalse(Main.checkArray(new int[]{1, 2, 2, 5, 2}));
        Assertions.assertFalse(Main.checkArray(new int[]{}));
    }

}
