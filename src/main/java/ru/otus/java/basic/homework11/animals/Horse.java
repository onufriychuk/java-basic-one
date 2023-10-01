package ru.otus.java.basic.homework11.animals;

public class Horse extends Animal {
    public Horse(String name, int speedRun, int speedSwim, int stamina, int runStaminaPerMetre, int swimStaminaPerMetre) {
        super(name, speedRun, speedSwim, stamina);
        this.runStaminaPerMetre = runStaminaPerMetre;
        this.swimStaminaPerMetre = swimStaminaPerMetre;
    }
}