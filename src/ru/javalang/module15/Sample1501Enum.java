package ru.javalang.module15;

import ru.javalang.module15.enums.Days;
import ru.javalang.module15.enums.SingletonDemo;

public class Sample1501Enum {
    public static void main(String[] args) {
        System.out.println(Days.MONDAY);
        System.out.println(Days.MONDAY.getValue());
        System.out.println(Days.MONDAY.ordinal());
    }
}
