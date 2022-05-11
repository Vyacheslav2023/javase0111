package ru.javalang.module04;

/**
 * Пример с месяцами и числом в них дней
 */

public class Sample402 {

    public static int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static String[] monthes = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

    public static void main(String[] args) {

        for (int i = 0, j = 0; i < monthDays.length && j < monthes.length; i++,j++) {
            System.out.println("В месяце " + monthes[j] + " обычно " + monthDays[i] + " день (дней), ");
        }

    }
}
