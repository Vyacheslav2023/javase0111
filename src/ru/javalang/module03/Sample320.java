package ru.javalang.module03;

import java.util.Scanner;

/**
 * Использование методов
 * изменение Примера 3.9 (Sample309)
 */
public class Sample320 {
    public static void main(String[] args) {

        System.out.print("Проверка на простые числа.\nВведите целое число: ");

        int num = new Scanner(System.in).nextInt();

        String s = numIsPrime(num)?" простое" : " непростое";

        System.out.println("Число " + num + s);
    }

    // Метод определения числа - Простое/Непростое
    public static boolean numIsPrime(int n) {

        boolean isPrime = true;

        if(n < 2) isPrime = false;
        else
            for (int i = 2; i <= n/i; i++) {
                if ((n % i) == 0) {
                    isPrime = false; break;
                }
            }
            return isPrime;
    }
}
