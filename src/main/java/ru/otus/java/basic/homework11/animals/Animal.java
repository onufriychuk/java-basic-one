package ru.otus.java.basic.homework11.animals;

public abstract class Animal {
    String name;
    int speedRun;
    int speedSwim;
    int stamina;
    int swimStaminaPerMetre;
    int runStaminaPerMetre;

    public Animal(String name, int speedRun, int speedSwim, int stamina) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.stamina = stamina;
    }

    public int run(int distance) {
        int time;
        if (this.stamina >= distance * runStaminaPerMetre) {
            time = distance / speedRun;
            System.out.println(this.name + " пробежал дистанцию за " + time + " секунд(ы)");
        } else {
            System.out.println("Выносливости не хватило. Появилось состояние усталости!");
            time = -1;
        }
        return time;
    }

    public int swim(int distance) {
        int time;
        if (this.stamina >= distance * swimStaminaPerMetre) {
            time = distance / speedSwim;
            System.out.println(this.name + " проплыл дистанцию за " + time + " секунд(ы)");
        } else {
            System.out.println("Выносливости не хватило. Появилось состояние усталости!");
            time = -1;
        }
        return time;
    }

    public void info() {
        System.out.println("Имя: " + name);
        System.out.println("Скорость бега: " + speedRun);
        System.out.println("Скорость плавания: " + speedSwim);
        System.out.println("Выносливость: " + stamina);
    }
}
