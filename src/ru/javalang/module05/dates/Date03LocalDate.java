package ru.javalang.module05.dates;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Date03LocalDate {
    public static void main(String[] args) {

        LocalDate localDateNow = LocalDate.now();

        System.out.println("Вывод даты с форматированием по умолчанию: "
                + localDateNow);

        DateTimeFormatter formatterDate =
                DateTimeFormatter.ofPattern("MM dd yyyy");
        System.out.println("Форматированный вывод даты: "
                + formatterDate.format(localDateNow));


        LocalDate date1 = LocalDate.parse("01 02 2015", formatterDate);
        System.out.println(date1);
        System.out.println(date1.format(DateTimeFormatter.ISO_DATE)); // 2015-01-02

        System.out.println(new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

    }
}
