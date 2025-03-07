package org.example;

// Интерфейс для геометрических фигур
public interface Math {
    double getArea();
    String getFillColor();
    String getBorderColor();
    default double getPerimeter() {
        return 0; //
    }
}
