package ru.otus.java.basic.homework13.transport;

import ru.otus.java.basic.homework13.Terrain;
import ru.otus.java.basic.homework13.Transport;

public class Bicycle  implements Transport {
    @Override
    public boolean move(int distance, Terrain terrainType) {
        if (terrainType == Terrain.SWAMP) {
            System.out.println("Велосипед тут не проедет");
            return false;
        }
        return true;
    }
}
