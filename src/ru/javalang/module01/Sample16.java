package ru.javalang.module01;

import java.util.Scanner;

/**
 * Пример программы с вводом текстовых данных - 2
 */

public class Sample16 {

    public static void main(String[] args) {

        // Объект для ввода данных
        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку: ");

        // Использование функции считывания строки
        String s = in.next();

        System.out.println("Строка: " + s);
    }
}
