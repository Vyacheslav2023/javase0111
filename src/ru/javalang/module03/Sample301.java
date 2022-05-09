package ru.javalang.module03;

import java.util.Scanner;

/**
 * Условный оператор if для определения четности или нечетности значения
 *
 * if(условие) оператор1;
 * else оператор2;
 */
public class Sample301 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Определение четности или нечетности числа.\nВведите целое число: ");

        int n = scanner.nextInt();

        if( n % 2 == 0 ){
            System.out.println("Число: " + n + " - четное!");
        } else {
            System.out.println("Число: " + n + " - НЕчетное!");
        }
    }
}
