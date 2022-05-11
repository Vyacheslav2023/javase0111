package ru.javalang.module05.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date05LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println(localDateTimeNow);

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(formatter));
        System.out.println(formatter.format(dateTime));

        LocalDateTime localDateTime1 = LocalDateTime.of(2021,10,25,12,55,15);

        System.out.println(localDateTime1);
        System.out.println(localDateTime1.format(formatter));


    }
}
