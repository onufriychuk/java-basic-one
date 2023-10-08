package ru.otus.java.basic.homework13;

public class Human {
    private String name;
    private Transport currentTransport;

    public void setCurrentTransport(Transport currentTransport) {
        this.currentTransport = currentTransport;
    }

    public void move(int distance, Terrain terrainType) {
        if (currentTransport != null) {
            currentTransport.move(distance, terrainType);
        }
        //идем пешком
        System.out.println("Человек "+ name + " прошёл всю дистанцию пешком.");
    }
}
