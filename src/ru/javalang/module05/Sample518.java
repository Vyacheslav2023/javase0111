package ru.javalang.module05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Sample518 {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("MMMM, dd, yyyy HH:mm:ss", Locale.US);

        System.out.println(dateTime.format(formatter));

        LocalDateTime localDateTime = LocalDateTime.of(2000,05,9,12,15,30);

        System.out.println(localDateTime.format(formatter));



    }
}
