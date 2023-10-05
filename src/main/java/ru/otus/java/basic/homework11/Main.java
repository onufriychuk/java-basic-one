package ru.otus.java.basic.homework11;

import ru.otus.java.basic.homework11.animals.Cat;
import ru.otus.java.basic.homework11.animals.Dog;
import ru.otus.java.basic.homework11.animals.Horse;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 35, 0, 30, 1, 0);
        Dog dog = new Dog("Шарик", 25, 5, 40, 1, 2);
        Horse horse = new Horse("Черри", 35, 5, 80, 1, 4);
        cat.swim(10);
        dog.swim(10);
    }
}
