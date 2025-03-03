package org.example;

public class cat extends animal {
    public static int count = 0;
    boolean hungry = true;
    public cat(String name, int amount, String move) {
        count++;
        this.name = name;
        this.amount = amount;
        this.move = move;
        if (move == "eat") {
            // с этого момента я запутался :)
        }
        if (move == "swim") {
            System.out.println("Я не умею плавать");
        }
        if (move == "run") {
            if (amount > 200) {
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
