package ru.otus.java.basic.homework11.animals;

public class Cat extends Animal {
    public Cat(String name, int speedRun, int speedSwim, int stamina, int runStaminaPerMetre, int swimStaminaPerMetre) {
        super(name, speedRun, speedSwim, stamina);
        this.runStaminaPerMetre = runStaminaPerMetre;
        this.swimStaminaPerMetre = swimStaminaPerMetre;
    }

    @Override
    public int swim(int distance) {
        System.out.println("Коты плавать не умеют!");
        return -1;
    }
}