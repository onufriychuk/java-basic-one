package ru.otus.java.basic.homework10;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Ivanov", "Ivan", "Sergeevich", 2000, "iii@ya.ru");
        User user2 = new User("Imamov", "Ivan", "Petrovich", 2001, "iip@ya.ru");
        User user3 = new User("Kuchin", "Sergey", "Sergeevich", 1960, "sdfg@ya.ru");
        User user4 = new User("Kravchuk", "Ivan", "Alexeevich", 1968, "ikbs@ya.ru");
        User user5 = new User("Melnik", "Maxim", "Sergeevich", 1987, "moonstar@ya.ru");
        User user6 = new User("Zhuk", "Alexey", "Olegovich", 1995, "56tr5@ya.ru");
        User user7 = new User("Kovalchuk", "Artem", "Igorevich", 1958, "sertig@ya.ru");
        User user8 = new User("Koppel", "Ivan", "Vladimirovich", 1965, "koppiv@ya.ru");
        User user9 = new User("Semenov", "Petr", "Sergeevich", 1986, "sps86@ya.ru");
        User user10 = new User("Ivanov", "Vladimir", "Maximovich", 1990, "ivm90@ya.ru");
        User[] users = {user1, user2, user3, user4, user5, user6, user7, user8, user9, user10};
        for (int i = 0; i < users.length; i++) {
            if (2023 - users[i].yearOfBirth >= 40) {
                users[i].print();
            }
        }

        Box box = new Box("Красный", 50, 50, 40);
        System.out.println(box.toString());
        box.setColor("Жёлтый");
        box.getItem();
        box.open();
        box.getItem();
        box.close();
        box.putItem("");
        box.putItem("Фонарик");
        box.open();
        box.putItem("Фонарик");
        System.out.println(box.toString());
        box.getItem();
    }
}
