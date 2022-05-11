package ru.javalang.module05;

import java.util.Formatter;

public class Sample510 {
    public static void main(String[] args) {

        Formatter formatter = new Formatter();

        double d1 = 16.78967;

        formatter.format("%1$e, %<f, %<g, %<a\n", d1);

        System.out.println(formatter);
    }
}
