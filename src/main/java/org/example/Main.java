//Создайте класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
//Создайте коллекцию, содержащую объекты класса Student.
//Следует написать метод, который удаляет студентов со средним баллом < 3, а также отдельный метод,
//который переводит студента на следующий курс, если средний балл >= 3.
//Напишите метод printStudents(Set<Student> students, int course),
//который получает список студентов и номер курса.
//Метод печатает на консоль имена тех студентов, которые обучаются на данном курсе.

package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Иван Иванов", "Группа1", 1, Arrays.asList(3.0, 4.0, 5.0)));
        students.add(new Student("Петр Петров", "Группа2", 1, Arrays.asList(2.0, 2.5, 3.0)));
        students.add(new Student("Мария Сидорова", "Группа1", 2, Arrays.asList(4.0, 4.5, 5.0)));

        System.out.println("Студенты на 1 курсе до обработки:");
        StudentUtils.printStudents(students, 1);

        StudentUtils.removeLowPerformingStudents(students);

        System.out.println("\nСтуденты на 1 курсе после удаления:");
        StudentUtils.printStudents(students, 1);

        for (Student student : students) {
            StudentUtils.promoteStudent(student);
        }

        System.out.println("\nСтуденты на 2 курсе после перевода:");
        StudentUtils.printStudents(students, 2);

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "123-45-67");
        phoneBook.add("Иванов", "987-65-43"); // Второй номер для Иванова
        phoneBook.add("Петров", "555-55-55");

        System.out.println("\nНомера для Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Номера для Петров: " + phoneBook.get("Петров"));
        System.out.println("Номера для Сидоров: " + phoneBook.get("Сидоров"));
    }
}
