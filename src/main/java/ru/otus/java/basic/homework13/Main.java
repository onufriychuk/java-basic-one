package ru.otus.java.basic.homework13;

import ru.otus.java.basic.homework13.transport.Bicycle;
import ru.otus.java.basic.homework13.transport.Car;
import ru.otus.java.basic.homework13.transport.Horse;
import ru.otus.java.basic.homework13.transport.Rover;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Лёха", new Car(10));
        human.move(30, Terrain.PLAIN);
        human.setCurrentTransport(new Bicycle());
        human.move(30, Terrain.PLAIN);
        human.setCurrentTransport(null);
        human.move(30, Terrain.PLAIN);
        human.setCurrentTransport(new Horse(30));
        human.move(30, Terrain.SWAMP);
    }
}
