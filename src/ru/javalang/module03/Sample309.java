package ru.javalang.module03;

import java.util.Scanner;

/**
 * Проверка на простые числа
 * использование break
 */
public class Sample309 {
    public static void main(String[] args) {

        // Предполагаем что все числа изначально простые
        boolean isPrime = true;

        System.out.print("Проверка на простые числа.\nВведите целое число: ");

        int num = new Scanner(System.in).nextInt();

        if(num < 2) isPrime = false;
        else
            for (int i = 2; i <= num/i; i++) {
                if ((num % i) == 0) {
                    isPrime = false; break;
                }
            }
        System.out.println("Число " + num + (isPrime?" простое" : " непростое"));

    }
}
