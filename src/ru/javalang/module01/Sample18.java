package ru.javalang.module01;

import java.util.Scanner;

/**
 * Пример программы с вводом целого числа
 */

public class Sample18 {

    // Объект для ввода данных
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите целое число: ");

        // Использование функции считывания целого числа
        int n = in.nextInt();

        System.out.println("Получено число: " + n);
    }
}
