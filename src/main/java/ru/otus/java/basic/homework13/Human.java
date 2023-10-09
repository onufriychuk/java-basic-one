package ru.otus.java.basic.homework13;

public class Human {
    private String name;
    private Transport currentTransport;

    public Human(String name, Transport currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;
    }

    public void setCurrentTransport(Transport currentTransport) {
        this.currentTransport = currentTransport;
    }

    public void move(int distance, Terrain terrainType) {
        if (currentTransport == null) {
            System.out.println("Человек "+ name + " прошёл всю дистанцию пешком.");
            return;
        }
        currentTransport.move(distance, terrainType);
    }
}
