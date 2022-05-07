package ru.javalang.module02;

import java.util.Scanner;

/**
 * Программа вычисления расстояния, проходимого лучом света за указанное число дней
 */
public class Sample203 {
    public static void main(String[] args) {

        System.out.println("Программа вычисления расстояния, проходимого лучом света, за указанное число дней.");

        Scanner scanner = new Scanner(System.in);

        // Скорость света, м/с
        int lightspeed = 299_792_458;
        long days, seconds, distance;

        System.out.print("Введите количество дней: ");
        days = scanner.nextInt();

        // Вычсисление количества секунд в днях
        seconds = days * 24 * 60 * 60;

        // Вычисление расстояния в метрах
        distance = lightspeed * seconds;

        System.out.println("За " + days + " дней (день) свет пройдет около " + distance + " метров.");

    }
}
