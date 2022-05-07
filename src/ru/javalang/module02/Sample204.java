package ru.javalang.module02;

import java.util.Scanner;

/**
 * Вычисление прощади окружности
 */
public class Sample204 {

    public final static double PI = 3.1415;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Объявление переменных для радиуса и площади окружности
        double r, area;

        System.out.print("Вычисление площади окружности.\n\nВведите радиус круга: ");

        r = scanner.nextDouble();

        area = PI * r * r;

        // можно воспользоваться библиотекой Math
        //area = Math.PI * r * r;

        System.out.println("Площадь окружности равна: "  + area);
    }
}
