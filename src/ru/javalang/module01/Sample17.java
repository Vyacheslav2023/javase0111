package ru.javalang.module01;

import java.util.Scanner;

/**
 * Пример программы с вводом вещественного числа
 */

public class Sample17 {

    // Объект для ввода данных
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите вещественное число\n(разделитель точка или запятая): ");

        // Использование функции считывания вещественного числа
        double n = in.nextDouble();

        System.out.println("Получено: " + n);
    }
}
