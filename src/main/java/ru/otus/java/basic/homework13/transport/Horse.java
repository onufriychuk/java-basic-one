package ru.otus.java.basic.homework13.transport;

import ru.otus.java.basic.homework13.Terrain;
import ru.otus.java.basic.homework13.Transport;

public class Horse  implements Transport {
    private int stamina;
    @Override
    public boolean move(int distance, Terrain terrainType) {
        if (terrainType == Terrain.SWAMP) {
            System.out.println("Лошадь тут не пройдёт");
            return false;
        }
        if (0.25 * distance > stamina) {
            System.out.println("У лошади не хватит сил!");
            return false;
        }
        stamina -= 0.25 * distance;
        return true;
    }
}
