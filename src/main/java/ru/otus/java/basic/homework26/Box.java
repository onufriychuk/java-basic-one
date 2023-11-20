package ru.otus.java.basic.homework26;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public void addFruit(T fruit) {
        this.fruits.add(fruit);
    }

    public double weight() {
        double sum = 0;
        if (this.fruits.isEmpty()) {
            return 0;
        }

        for (Fruit fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public boolean compare(Box<?> anotherBox) {
        return this.weight() == anotherBox.weight();
    }

    public void fruitsOverflow(Box<? super T> otherBox) {
        if (otherBox == null || otherBox == this) {
            return;
        }
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
