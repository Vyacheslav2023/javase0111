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

public class Sample304 {
    public static void main(String[] args) {
        System.out.println("Введите номер текущего месяца\nдля определения времени года:");

        int m = new Scanner(System.in).nextInt();

        String month = "", season; int ndays;

        switch(m) {
            case 1: month = "Январь"; ndays = 31; season = "зима"; break;
            case 2: month = "Февраль"; ndays = 28; season = "зима"; break;
            case 3: month = "Март"; ndays = 31; season = "весна"; break;
            case 4: month = "Апрель"; ndays = 30; season = "весна"; break;
            case 5: month = "Май"; ndays = 31; season = "весна"; break;
            case 6: month = "Июнь"; ndays = 30; season = "лето"; break;
            case 7: month = "Июль"; ndays = 31; season = "лето"; break;
            case 8: month = "Август"; ndays = 31; season = "лето"; break;
            case 9: month = "Сентябрь"; ndays = 30; season = "осень"; break;
            case 10: month = "Октябрь"; ndays = 31; season = "осень"; break;
            case 11: month = "Ноябрь"; ndays = 30; season = "осень"; break;
            case 12: month = "Декабрь"; ndays = 31; season = "осень"; break;
            default:
                season = "нет такого!";
        }

        System.out.println("Введен месяц " + month + ", значит сейчас " + season);
    }
}
