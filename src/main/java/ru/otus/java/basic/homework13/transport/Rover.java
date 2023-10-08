package ru.otus.java.basic.homework13.transport;

import ru.otus.java.basic.homework13.Terrain;
import ru.otus.java.basic.homework13.Transport;

public class Rover  implements Transport {
    private double fuel = 100;
    @Override
    public boolean move(int distance, Terrain terrainType) {
        if (0.25 * distance > fuel) {
            System.out.println("Не хватит бензина!");
            return false;
        }
        fuel -= 0.25 * distance;
        return true;
    }
}
