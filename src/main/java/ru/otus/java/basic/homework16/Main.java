package ru.otus.java.basic.homework16;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Сидоров", "+78888888888");
        phoneBook.add("Сидоров", "+79999999999");
        phoneBook.add("Иванов", "+78888888888");
        phoneBook.add("Друзь", "+72222222222");
        phoneBook.add("Друзь", "+71111111111");
        phoneBook.add("Друзь", "+71212121212");

        Set<String> phones = phoneBook.find("Друзь");
        if (phones != null) {
            System.out.println(phones);
        } else {
            System.out.println("Такой человек отсутствует в базе");
        }

        System.out.println(phoneBook.containsPhoneNumer("+79999999999")?"Номер есть в базе":"Такого номера нет в базе");
    }
}
