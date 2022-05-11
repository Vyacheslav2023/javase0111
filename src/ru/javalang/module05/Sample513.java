package ru.javalang.module05;

import java.time.LocalDateTime;
import java.util.Formatter;

/**
 * Форматирование даты
 */

public class Sample513 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        LocalDateTime localDateTime = LocalDateTime.now();
        formatter.format("%tr", localDateTime);
        System.out.println(formatter);
    }
}
