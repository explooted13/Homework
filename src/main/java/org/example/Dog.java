package org.example;

public class Dog extends Animal {
    public static int count = 0;
    public Dog(String name) {
        count++;
        this.name = name;
        runLimit = 500;
        swimLimit = 10;
    }
    public static int getCount() {
        return count;
    }
}
