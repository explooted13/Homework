package org.example;
import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> map = new HashMap<>();

    public void add(String surname, String phone) {
        map.computeIfAbsent(surname, k -> new ArrayList<>()).add(phone);
    }

    public List<String> get(String surname) {
        return map.getOrDefault(surname, Collections.emptyList());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "123-45-67");
        phoneBook.add("Иванов", "987-65-43"); // Второй номер для Иванова
        phoneBook.add("Петров", "555-55-55");

        System.out.println("Номера для Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Номера для Петров: " + phoneBook.get("Петров"));
        System.out.println("Номера для Сидоров: " + phoneBook.get("Сидоров"));
    }
}