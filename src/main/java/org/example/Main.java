package org.example;

import java.sql.Array;
public class Main{
public static void main(String[] args) {
    bowl bowl = new bowl();
    bowl.addEat(100);
    cat cat1 = new cat("Vasya",7,"run");
    cat cat2 = new cat("Ugolyek",1150,"eat");
    dog dog1 = new dog("Sharik",150,"run");
    dog dog2 = new dog("Sharik",50,"swim");
    System.out.println("Кошек создано: "+cat.getCount());
    System.out.println("Собак создано: "+dog.getCount());


    math circle = new Circle(5, "Красный", "Черный");
    math rectangle = new Rectangle(4, 7, "Синий", "Зеленый");
    math triangle = new Triangle(3, 4, 5, "Желтый", "Фиолетовый");

    printMathInfoInfo(circle);
    printMathInfoInfo(rectangle);
    printMathInfoInfo(triangle);
}
    private static void printMathInfoInfo(math shape) {
        System.out.println("Фигура: " + shape.getClass().getSimpleName());
        System.out.println("Периметр: " + shape.getPerimeter());
        System.out.println("Площадь: " + shape.getArea());
        System.out.println("Цвет заливки: " + shape.getFillColor());
        System.out.println("Цвет границы: " + shape.getBorderColor());
        System.out.println("------------------------");
    }
}