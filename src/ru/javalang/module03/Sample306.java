package ru.javalang.module03;

import java.util.Scanner;

public class Sample306 {
    public static void main(String[] args) {
        System.out.println("Введите номер текущего месяца\nдля определения времени года:");

        int m = new Scanner(System.in).nextInt();

        String month = switch (m) {
            case 1 -> "Январь"; case 2 -> "Февраль";
            case 3 -> "Март"; case 4 -> "Апрель"; case 5 -> "Май";
            case 6 -> "Июнь"; case 7 -> "Июль"; case 8 -> "Август";
            case 9 -> "Сентябрь"; case 10 -> "Октябрь"; case 11 -> "Ноябрь";
            case 12 -> "Декабрь";
            default -> "неизвестный месяц";
        };
        String season="";
        switch (m) {
            case 12: case 1: case 2: season ="Зима"; break;
            case 3: case 4: case 5: season ="Весна"; break;
            case 6: case 7: case 8: season ="Лето"; break;
            case 9: case 10: case 11: season ="Осень"; break;
            default: season = "странный месяц";
        };
        System.out.println("Введен месяц " + month + ", значит сейчас " + season);
    }
}
