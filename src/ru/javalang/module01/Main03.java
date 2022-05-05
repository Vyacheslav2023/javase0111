package ru.javalang.module01;

import java.util.Scanner;

/**
 * Пример программы с вводом данных
 */

public class Main03 {

    // Переменная для ввода
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите строку: ");

        String s = in.next();

        System.out.println("Вы ввели: " + s);
    }
}
