package org.example;

public class Main {
    public static void main(String[] args) {
        Bowl bowl = new Bowl(200);
        bowl.addEat(1);
        Cat[] cats = new Cat[] {
                new Cat("Vasya"),
                new Cat("Ugolyek"),
                new Cat("Murzik"),
                new Cat("Barsik")
        };
        Dog dog1 = new Dog("Sharik");
        dog1.swim(49);
        for (Cat cat : cats) {
            cat.eat(bowl, 60);
        }

        System.out.println("\nИнформация о котах:");
        for (Cat cat : cats) {
            System.out.println("Кот " + cat.name + " сыт: " + cat.isSatiated());
        }
        System.out.println("Еды в миске осталось: " + bowl.getFoodAmount());
        System.out.println("Кошек создано: " + Cat.getCount());
    }
}