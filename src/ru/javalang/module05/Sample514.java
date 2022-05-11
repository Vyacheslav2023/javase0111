package ru.javalang.module05;

import java.time.LocalDateTime;
import java.util.Locale;

/**
 * Локализация
 */
public class Sample514 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.printf(Locale.FRANCE, "%1$tB %1$tA%n", ldt);
        System.out.printf(Locale.getDefault(), "%1$tB %1$tA%n", ldt);
    }
}
