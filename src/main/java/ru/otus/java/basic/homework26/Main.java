package ru.otus.java.basic.homework26;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new ArrayList<>());
        Box<Apple> appleBox1 = new Box<>(new ArrayList<>());
        Box<Orange> orangeBox = new Box<>(new ArrayList<>());
        Box<Fruit> fruitBox = new Box<>(new ArrayList<>());

        appleBox.addFruit(new Apple(0.35));
        appleBox.addFruit(new Apple(0.4));
        appleBox.addFruit(new Apple(0.42));
        orangeBox.addFruit(new Orange(0.5));
        orangeBox.addFruit(new Orange(0.55));
        orangeBox.addFruit(new Orange(0.4));
        System.out.println(appleBox.compare(orangeBox));
        fruitBox.addFruit(new Apple(15));
        System.out.println(appleBox.compare(fruitBox));

    }
}
