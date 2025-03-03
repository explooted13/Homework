package org.example;

// Интерфейс для геометрических фигур
public interface math {
    double getArea();
    String getFillColor();
    String getBorderColor();
    default double getPerimeter() {
        return 0; //
    }
}
