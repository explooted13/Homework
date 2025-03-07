package org.example;

import java.lang.Math;

class Bowl {
    private int foodAmount;

    public Bowl(int initialAmount) {
        this.foodAmount = Math.max(0, initialAmount);
    }

    public void addEat(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("В миску добавлено " + amount + " единиц еды. Теперь еды: " + foodAmount);
        }
    }

    public boolean decreaseFood(int amount) {
        if (amount <= 0) {
            return false;
        }
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}