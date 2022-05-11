package ru.javalang.module05.dates;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date06Period {

    public static void main(String[] args) throws InterruptedException {

        LocalTime.ofSecondOfDay(5000);
        System.out.println(LocalTime.ofSecondOfDay(5000));

        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6,15);
        LocalTime timeTo = LocalTime.of(7,23);

        Duration duration = Duration.between(time, timeTo);
        System.out.println(duration);

        LocalDateTime dateTime = LocalDateTime.of(date, time);

        Period period = Period.ofMonths(1);

        System.out.println(date.plus(period));

        System.out.println(dateTime.plus(period));
//        System.out.println(time.plus(period));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");

        System.out.println(dateTime.format(formatter));

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("hh:mm");

        System.out.println(formatter1.format(dateTime));

        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("MM dd yyyy");

        LocalDate date1 = LocalDate.parse("01 02 2015", formatterDate);

        LocalTime time1 = LocalTime.parse("11:22");

        System.out.println(formatterDate.format(date1)); // 2015-01-02

        System.out.println(date1.format(DateTimeFormatter.ISO_DATE)); // 2015-01-02

        System.out.println(time1); // 11:22
    }

    public static void method(){
        System.out.println("Выполнение задачи!");
    }
}
