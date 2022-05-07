package ru.javalang.module02;

import java.util.Scanner;

public class Sample202 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Объявление переменных целочисленного типа
        int a, b, c;

        System.out.println("Введите 2 числа: ");

        a = scanner.nextInt();
        b = scanner.nextInt();

        c = a + b;

    }
}
