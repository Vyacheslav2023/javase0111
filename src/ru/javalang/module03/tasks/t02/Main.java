package ru.javalang.module03.tasks.t02;

import java.util.Scanner;

/**
 * Ввести с клавиатуры число и проверить,
 * принадлежит ли это число диапазону от N до M (включительно).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int N=10,M=20;
        int x=scan.nextInt();
        if (x<M && x>N) System.out.println("Prinadlejit");
        else System.out.println("Ne prinadlejit");

    }
}
