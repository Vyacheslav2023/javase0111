package ru.javalang.module05;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class Sample517 {
    public static void main(String[] args) {
        DateFormat dfFull = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        DateFormat dfLong = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
        DateFormat dfMedium = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
        DateFormat dfShort = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);

        Date date = new Date();
        System.out.println(dfFull.format(date));
        System.out.println(dfLong.format(date));
        System.out.println(dfMedium.format(date));
        System.out.println(dfShort.format(date));
    }
}
