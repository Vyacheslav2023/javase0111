package ru.javalang.module05;

import java.util.Arrays;

/**
 * Пример со вставкой в StringBuilder
 */

public class Sample507 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Java stringBuilder");
        sb.insert(5, "insert ");
        sb.setCharAt(12, 'S');
        System.out.println("StringBuilder: " + sb);

        StringBuffer sb1 = new StringBuffer();

        sb1.append(Integer.valueOf(2))
                .append("; ")
                .append(false)
                .append("; ")
                .append(Arrays.asList(1,2,3))
                .append("; ");

        System.out.println(sb1); // 2; false; [1, 2, 3];
    }
}
