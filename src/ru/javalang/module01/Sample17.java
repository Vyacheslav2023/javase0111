package ru.javalang.module01;

import java.util.Scanner;

/**
 * Пример программы с вводом текстовых данных - 3
 */

public class Sample17 {

    public static void main(String[] args) {

        System.out.print("Введите строку: ");

        // Использование функции считывания строки с одновременным созданием объекта
        String s = new Scanner(System.in).next();

        System.out.println("Строка: " + s);
    }
}
