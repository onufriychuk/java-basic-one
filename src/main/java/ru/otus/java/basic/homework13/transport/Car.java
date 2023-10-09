package ru.otus.java.basic.homework13.transport;

import ru.otus.java.basic.homework13.Terrain;
import ru.otus.java.basic.homework13.Transport;

public class Car implements Transport {
    private double fuel = 40;

    public Car(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(int distance, Terrain terrainType) {
        if (terrainType == Terrain.FOREST || terrainType == Terrain.SWAMP) {
            System.out.println("Машина тут не проедет");
            return false;
        }
        if (0.1 * distance > fuel) {
            System.out.println("У машины не хватит бензина!");
            return false;
        }
        fuel -= 0.1 * distance;
        System.out.println("Проехали " + distance + " км. на машине");
        return true;
    }
}
