package ru.javalang.module05.dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date04LocalTime {

    public static void main(String[] args) {

        LocalTime localTimeNow = LocalTime.now();

        System.out.println("Вывод времени с форматированием по умолчанию: "
                + localTimeNow);

        DateTimeFormatter formatterTime = DateTimeFormatter
                .ofPattern("hh:mm");
        System.out.println("Форматированный вывод времени: "
                + formatterTime.format(localTimeNow));

        System.out.println(LocalTime
                .of(6,15, 30, 200));

        LocalTime time1 = LocalTime.parse("11:22");
        System.out.println(time1);

    }
}
