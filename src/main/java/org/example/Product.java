package org.example;

public class Product {
    private String name;
    private String date;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean isReserved;

    // Название, дата, производитель, страна происхождения, цена, состояние бронирования прокупателем
    public Product(String name, String date, String manufacturer,
                   String countryOfOrigin, double price, boolean isReserved) {
        this.name = name;
        this.date = date;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isReserved = isReserved;
    }
    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + date);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Состояние бронирования: " + (isReserved ? "Забронировано" : "Свободно"));
    }
}