package ru.javalang.module02.tasks.t01;

import java.util.Scanner;

/**
 * Задание 1.
 * Ввести с клавиатуры натуральное число.
 * Вывести на экран младший разряд числа.
 *
 * For example:
 * --------------------------
 * |    Input   |   Result  |
 * --------------------------
 * |    234     |   4       |
 * --------------------------
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Define and initialize variable 'in'
        // Объявление и инициализация переменной 'in'
        Scanner in = new Scanner(System.in);

        System.out.print("Задача 1: Вывести на экран младший разряд числа.\nВведите целое число: ");

        // Define and initialize variable 'x'
        // Объявление и инициализация переменной 'x'
        int x = in.nextInt();

        // Define and initialize variable 'result'
        // Объявление и инициализация переменной 'result'
        int result = x%10;

        // Show result
        // Вывод результата
        System.out.println("младший разряд числа " + x + " равен " + result);
    }
}
