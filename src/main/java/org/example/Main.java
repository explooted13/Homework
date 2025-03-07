package org.example;
import java.time.LocalDate;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Телефон", "28.02.2025", "Samsung", "Южная Корея", 59999.99, false);
        product.printInfo();
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Телевизор", "28.02.2025","Samsung", "Южная корея",59999.99,false);
        productsArray[1] = new Product("Машина", "28.02.2025","Samsung", "Южная корея",519999.99,false);
        productsArray[2] = new Product("Велосипед", "28.02.2025","Samsung", "Южная корея",29999.99,false);
        productsArray[3] = new Product("Дверь", "28.02.2025","Samsung", "Южная корея",539999.99,false);
        productsArray[4] = new Product("Чайник", "28.02.2025","Samsung", "Южная корея",1319999.99,false);
        Park park = new Park("Колесо обозрения", "07:00","21:00",50);
        park.printInfo();
    }
}