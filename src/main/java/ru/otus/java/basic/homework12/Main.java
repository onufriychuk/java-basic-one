package ru.otus.java.basic.homework12;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(200);
        Cat[] cats = {
                new Cat("Петя", 60),
                new Cat("Барсик", 40),
                new Cat("Корица", 50),
                new Cat("Сима", 30),
                new Cat("Кюхельбекер", 50),
                new Cat("Мухомор", 60),
                new Cat("Рыжая Борзая", 25),
                new Cat("Гранж", 28),
                new Cat("Пупырь", 35)
        };
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.toString());
        }
        System.out.println(plate.toString());
    }
}
