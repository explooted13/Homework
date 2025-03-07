package org.example;

abstract class Animal {
    public String name;
    public int runLimit;
    public int swimLimit;

    public void run(int distance) {
        if (distance > runLimit) {
            System.out.println(name+" не умеет бегать так далеко.");
        } else {
            System.out.println(name+" пробежал " + distance + " метров");
        }
    }

    public void swim(int distance) {
        if (distance > swimLimit) {
            System.out.println(name+" не умеет плавать так далеко.");
        } else {
            System.out.println(name+" проплыл " + distance + " метров");
        }
    }
}
