package org.example;
import java.sql.Array;
class Main extends ArrayChecker {
    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "b", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidArray = {
                {"1", "2", "3"},
                {"4", "5", "6", "7"},
                {"8", "9", "10", "11"},
                {"12", "13", "14", "15"}
        };

        try {
            validateArray(validArray);
            int sum = sumArray(validArray);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArrayException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            validateArray(invalidArray);
            int sum = sumArray(invalidArray);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArrayException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
        generateArrayIndexOutOfBoundsException();
    }
}