package ru.otus.java.basic.homework12;

public class Plate {
    private int maxAmountOfFood;
    private int currentAmountOfFood;

    public Plate(int maxAmountOfFood) {
        this.maxAmountOfFood = maxAmountOfFood;
        fill();
    }

    public void fill() {
        currentAmountOfFood = maxAmountOfFood;
    }

    public boolean reduceAmountOfContent(int amount) {
        if (currentAmountOfFood - amount >= 0) {
            currentAmountOfFood -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Тарелка заполнена на " + currentAmountOfFood + "/" + maxAmountOfFood + ".";
    }
}
