package ru.javalang.module03.tasks.t01;

import java.util.Scanner;

/**
 *
 * Ввести число, и выяснить -
 * положительное оно, отрицательное, или равно нулю?
 *
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x=scan.nextInt();
        if (x<0) System.out.println("Отрицательное");
        else if (x==0) System.out.println("Ноль");
        else System.out.println("Положительное");
    }
}
