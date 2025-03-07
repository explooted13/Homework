package org.example;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        Bowl bowl = new Bowl(200);
        bowl.addEat(10000);
        Cat[] cats = new Cat[] {
                new Cat("Vasya"),
                new Cat("Ugolyek"),
                new Cat("Murzik"),
                new Cat("Barsik")
        };

        for (Cat cat : cats) {
            cat.eat(bowl, 60);
        }
        Dog dog1 = new Dog("Sharik");
        dog1.swim(5);
        System.out.println("\nИнформация о котах:");
        for (Cat cat : cats) {
            System.out.println("Кот " + cat.name + " сыт: " + cat.isSatiated());
        }
        System.out.println("Еды в миске осталось: " + bowl.getFoodAmount());
        System.out.println("Кошек создано: " + Cat.getCount());

        // Задание 2
        System.out.println("\nЗадание 2: Геометрические фигуры");

        Shape circle = new Circle(5, "Красный", "Черный");
        Shape rectangle = new Rectangle(4, 6, "Синий", "Зеленый");
        Shape triangle = new Triangle(3, 4, 5, "Желтый", "Фиолетовый");

        Shape[] shapes = {circle, rectangle, triangle};

        for (Shape shape : shapes) {
            System.out.println("\nФигура: " + shape.getClass().getSimpleName());
            System.out.println("Периметр: " + shape.getPerimeter());
            System.out.println("Площадь: " + shape.getArea());
            System.out.println("Цвет заливки: " + shape.getFillColor());
            System.out.println("Цвет границы: " + shape.getBorderColor());
        }
    }
}