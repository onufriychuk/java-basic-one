package ru.otus.java.basic.homework10;

public class Box {
    private String colour;
    private int size1;
    private int size2;
    private int size3;
    private boolean isOpen;
    private String item = "";

    public Box(String colour, int size1, int size2, int size3) {
        this.colour = colour;
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
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
        if (item != null && item.length() > 0) {
            if (this.isOpen && this.item.length() == 0) {
                this.item = item;
                System.out.println("Поместили " + item + " в коробку.");
            } else {
                System.out.println("Сперва откройте коробку!");
            }
        } else {
            System.out.println("Не ясно, что вы собираетесь сюда положить?");
        }
    }

    public void getItem() {
        if (this.isOpen) {
            if (this.item.length() > 0) {
                System.out.println("Достали " + this.item + " из коробки.");
                this.item = "";
            } else {
                System.out.println("В коробке пусто.");
            }
        } else {
            System.out.println("Сперва откройте коробку!");
        }
    }

    @Override
    public String toString() {
        return "Коробка размера " + this.size1 + "x" + this.size2 + "x" + this.size3 +
                ", Цвет: " + this.colour +
                ", Состояние: " + (this.isOpen?"Открыта":"Закрыта") +
                ", в коробке " + (this.item.length()>0?this.item:"пусто");
    }
}
