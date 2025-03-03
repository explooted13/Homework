package org.example;

public class dog extends animal {
    public static int count = 0;
    public dog(String name, int amount, String move) {
        count++;
        this.name = name;
        this.amount = amount;
        this.move = move;
        if (move == "swim") {
            if (amount > 10) {
                System.out.println("Я не могу плавать так далеко");
            } else {
                swim(amount);
            }
        }
        if (move == "run") {
            if (amount > 500) {
                System.out.println("Я не могу бегать так далеко");
            } else {
                run(amount);
            }
        }
    }
    public static int getCount() {
        return count; // Возвращаем количество созданных кошек
    }
}//
