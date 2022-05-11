package ru.javalang.module05.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date02Calendar {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        Calendar c1 = Calendar.getInstance();
        c.set(1999,4,23);
        c1.set(1999,5,24);
        long cDiff = c1.getTimeInMillis()-c.getTimeInMillis();

        System.out.println();

        System.out.println("Разница в секундах = " + (cDiff/1000));
        System.out.println("Разница в минутах = " + (cDiff/(1000*60)));
        System.out.println("Разница в часах = " + (cDiff/(1000*60*60)));
        System.out.println("Разница в днях = " + (cDiff/(1000*60*60*24)));

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.MILLISECOND));

    }

}
