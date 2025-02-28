package org.example;
import java.time.LocalDate;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        product product = new product("Телефон", "28.02.2025", "Samsung", "Южная Корея", 59999.99, false);
        product.printInfo();
        product[] productsArray = new product[5];
        productsArray[0] = new product("Телевизор", "28.02.2025","Samsung", "Южная корея",59999.99,false);
        productsArray[1] = new product("Машина", "28.02.2025","Samsung", "Южная корея",519999.99,false);
        productsArray[2] = new product("Велосипед", "28.02.2025","Samsung", "Южная корея",29999.99,false);
        productsArray[3] = new product("Дверь", "28.02.2025","Samsung", "Южная корея",539999.99,false);
        productsArray[4] = new product("Чайник", "28.02.2025","Samsung", "Южная корея",1319999.99,false);
    }
}