package ru.javalang.module03;

import java.util.Scanner;

/**
 * Конструкция if-else-if
 *
 * if(условие1) оператор1;
 * else if(условие2) оператор2;
 * else if(условие3) оператор3;
 * ... [ещё условия]
 * else оператор4;
 */
public class Sample303 {
    public static void main(String[] args) {

        System.out.println("Введите номер текущего месяца\nдля определения времени года:");

        int month = new Scanner(System.in).nextInt();

        String season;

        if(month == 12 || month == 1 || month == 2)
            season = "зима";
        else if(month == 3 || month == 4 || month == 5)
            season = "весна";
        else if(month == 6 || month == 7 || month == 8)
            season = "лето";
        else if(month == 9 || month == 10 || month == 11)
            season = "осень";
        else season = "нет такого!";

        System.out.println("Введен месяц " + month + ", значит сейчас " + season);
    }
}
