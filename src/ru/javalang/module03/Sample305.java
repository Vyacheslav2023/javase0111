package ru.javalang.module03;

import java.util.Scanner;

/**
 * Оператор Switch
 *
 * switch(выражение) {
 *     case значение1:
 *     //операторы
 *     break;
 *     case значение2:
 *     //операторы
 *     break;
 *     ...
 *     default:
 *     //операторы по-умолчанию
 * }
 *
 */

public class Sample305 {
    public static void main(String[] args) {
        System.out.println("Введите номер текущего месяца\nдля определения времени года:");

        int m = new Scanner(System.in).nextInt();

        String season;

        switch(m) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
            case 6:
            case 7:
            case 8:
                season = "лето";
            case 9:
            case 10:
            case 11:
                season = "осень";
            default:
                season = "нет такого!";
        }

        System.out.println("Введен месяц " + m + ", значит сейчас " + season);
    }
}
