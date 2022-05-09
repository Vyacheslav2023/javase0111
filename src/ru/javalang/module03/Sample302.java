package ru.javalang.module03;

import java.util.Scanner;

/**
 * Вариант с тернарным оператором
 * <условие>? <верно> : <неверно>
 */
public class Sample302 {
    public static void main(String[] args) {

        System.out.println("Определение четности или нечетности числа.\nВведите целое число: ");

        int n = new Scanner(System.in).nextInt();

        // Тернарный оператор
        String s = n % 2 == 0 ? "четное" : "нечетное";

        System.out.println("Число: " + n + " - " + s);

    }
}
