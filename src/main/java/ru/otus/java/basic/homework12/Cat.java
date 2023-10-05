package ru.otus.java.basic.homework12;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Plate plate) {
        if (fullness) {
            System.out.println("Пытаемся накормить кота, но " + name + " уже сыт!");
            return;
        }
        if (plate.reduceAmountOfContent(appetite)) {
            fullness = true;
            System.out.println(name + " поел.");
            return;
        }
        System.out.println(name + " не поел. В тарелке не хватает еды!");
    }

    @Override
    public String toString() {
        return "Кот " + name + " (аппетит " + appetite + ") " +
                (fullness?"сыт и доволен":"голоден и царапается");
    }
}
