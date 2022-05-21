package ru.javalang.module17.p03Factory;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PatternFactoryMetod {

    public static final String DIGITALWATCH = "digital";
    public static final String ROMANWATCH = "roman";

    public static void main(String[] args) {
        WatchMaker watchMaker = PatternFactoryMetod.getWatchByName(DIGITALWATCH);
        Watch watch = watchMaker.makeWatch();
        watch.showTime();
        watch.showDate();
    }

    public static WatchMaker getWatchByName(String name){
        switch (name){
            case DIGITALWATCH:
                return new DigitalWatchMaker();
            case ROMANWATCH:
                return new RomanWatchMaker();
        }
        throw new RuntimeException("Неподдерживаемый тип: " + name);
    }
}

interface Watch{
    void showTime();
    void showDate();
}

class DigitalWatch implements Watch {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
    SimpleDateFormat simpleTimeFormat = new SimpleDateFormat("HH:mm:ss");
    @Override
    public void showTime() {
        System.out.print("Time is: ");
        System.out.println(simpleTimeFormat.format(new Date()));
    }

    @Override
    public void showDate() {
        System.out.print("Date is: ");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}

class RomanWatch extends RomanNumbers implements Watch{

    Calendar c = Calendar.getInstance();

    @Override
    public void showTime() {
        System.out.print("Time is: ");
        System.out.println(
                stringToRoman(c.get(Calendar.HOUR)) + ":"
                        + stringToRoman(c.get(Calendar.MINUTE)) + ":"
                        + stringToRoman(c.get(Calendar.SECOND))
        );
    }

    @Override
    public void showDate() {
        System.out.print("Date is: ");
        System.out.println(
                          stringToRoman(c.get(Calendar.DATE)) + "."
                        + stringToRoman(c.get(Calendar.MONTH)+1) + "."
                        + stringToRoman(c.get(Calendar.YEAR))
        );
    }
}

interface WatchMaker{
    Watch makeWatch();
}

class DigitalWatchMaker implements WatchMaker{

    @Override
    public Watch makeWatch() {
        return new DigitalWatch();
    }
}

class RomanWatchMaker implements WatchMaker{

    @Override
    public Watch makeWatch() {
        return new RomanWatch();
    }
}