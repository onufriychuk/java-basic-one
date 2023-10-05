package ru.otus.java.basic.homework11.animals;

public class Dog extends Animal {
    public Dog(String name, int speedRun, int speedSwim, int stamina, int runStaminaPerMetre, int swimStaminaPerMetre) {
        super(name, speedRun, speedSwim, stamina);
        this.runStaminaPerMetre = runStaminaPerMetre;
        this.swimStaminaPerMetre = swimStaminaPerMetre;
    }
}
