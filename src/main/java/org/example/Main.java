package org.example;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(-100, 4);
        printColor(101);
        compareNumbers(30, 20);
        System.out.println(method5(6, 7));
        method6(1);
        System.out.println(method7(6));
        method8(5, "test");
        System.out.println(method9(2025));
        method10();
        method11();
        method12();
        method13();
        method14(4,322);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Orange");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");

        } else System.out.println("Зеленый");
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");

    }

    public static boolean method5(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void method6(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        }
        if (a < 0) {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean method7(int a) {
        return a < 0;
    }

    public static void method8(int a, String b) {
        for (int i = 0; i < a; i++) {
            System.out.println(b);
        }
    }

    public static boolean method9(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public static void method10() {
        int array[] = {0, 0, 0, 0, 1, 1, 1, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                array[i] = 1;
            else if (array[i] == 1)
                array[i] = 0;
        }
    }

    public static void method11() {
        int array[] = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public static void method12() {
        int array[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
    }

    public static void method13() {
        int array[][] = new int[6][6];
        System.out.println("___");
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;      // Главная диагональ
            array[i][5 - i] = 1;      // Обратная диагональ
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Переход на новую строку
        }
    }

    public static void method14(int len, int initialValue) {
        int array[] = new int [len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        for (int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}