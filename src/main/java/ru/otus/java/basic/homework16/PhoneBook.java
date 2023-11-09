package ru.otus.java.basic.homework16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, HashSet<String>> phoneBook = new HashMap<>();

    public void add(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNumber);
        } else {
            phoneBook.put(name, new HashSet<>(Set.of(phoneNumber)));
        }
    }

    public Set<String> find(String name) {
        return phoneBook.get(name);
    }

    public boolean containsPhoneNumer(String phoneNumer) {
        for (Map.Entry<String, HashSet<String>> pair : phoneBook.entrySet()) {
            for (String s : pair.getValue()) {
                if (s.equals(phoneNumer)) {
                    return true;
                }
            }
        }
        return false;
    }
}
