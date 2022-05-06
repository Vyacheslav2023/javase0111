package ru.javalang.module01;

import java.util.Scanner;

/**
 * Пример программы с вводом текстовых данных - 1
 */

public class Sample15 {

    // Объект для ввода данных
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите строку: ");

        // Использование функции считывания строки
        String s = in.next();

        System.out.println("Вы ввели: " + s);
    }
}
