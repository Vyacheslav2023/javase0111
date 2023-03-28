package ru.javalang.module03.tasks.t16;

import java.util.Scanner;

/**
 * Вывести на экран горизонтальную линию из звёздочек.
 * Число звездочек указывает пользователь
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("Vvedite chislo zvezd: ");
        int n = new Scanner(System.in).nextInt();
        zvezdy(n);
    }
    public static void zvezdy(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

    }
}
