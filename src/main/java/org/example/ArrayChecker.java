package org.example;

class MyArrayException extends Exception {
    public MyArrayException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class ArrayChecker {
    public static void validateArray(String[][] array) throws MyArrayException {
        if (array.length != 4) {
            throw new MyArrayException("Массив должен быть размером 4x4, но передано " + array.length + " строк.");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArrayException("Строка " + i + " имеет " + array[i].length + " элементов вместо 4.");
            }
        }
        System.out.println("Массив прошёл проверку.");
    }

    public static int sumArray(String[][] array) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка в ячейке [" + i + "][" + j + "]: невозможно преобразовать '" + array[i][j] + "' в число.");
                }
            }
        }
        return sum;
    }
    public static void generateArrayIndexOutOfBoundsException() {
        try {
            int[] testArray = {1, 2, 3};
            System.out.println(testArray[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Ошибка: выход за границы массива - " + e.getMessage());
        }
    }
}