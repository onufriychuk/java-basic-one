package ru.otus.java.basic.homework10;

public class Box {
    private String colour;
    private int length;
    private int width;
    private int height;
    private boolean isOpen;
    private String item = "";

    public Box(String colour, int length, int width, int height) {
        this.colour = colour;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void open() {
        this.isOpen = true;
        System.out.println("Открыли коробку.");
    }

    public void close() {
        this.isOpen = false;
        System.out.println("Закрыли коробку.");
    }

    public void setColor(String colour) {
        this.colour = colour;
        System.out.println("Перекрасили коробку! Текущий цвет: " + this.colour);
    }

    public void putItem(String item) {
        if (item == null || item.isEmpty()) {
            System.out.println("Не ясно, что вы собираетесь сюда положить?");
            return;
        }
        if (!isOpen) {
            System.out.println("Сперва откройте коробку!");
            return;
        }
        this.item = item;
        System.out.println("Поместили " + item + " в коробку.");

    }

    public void getItem() {
        if (!isOpen) {
            System.out.println("Сперва откройте коробку!");
            return;
        }
        if (item.isEmpty()) {
            System.out.println("В коробке пусто.");
            return;
        }
        System.out.println("Достали " + this.item + " из коробки.");
        item = "";
    }

    @Override
    public String toString() {
        return "Коробка размера " + this.length + "x" + this.width + "x" + this.height +
                ", Цвет: " + this.colour +
                ", Состояние: " + (this.isOpen ? "Открыта" : "Закрыта") +
                ", в коробке " + (this.item.length() > 0 ? this.item : "пусто");
    }
}
