package ru.javalang.module02;

/**
 * Основные арифметические операции
 */
public class Sample214 {
    public static void main(String[] args) {
        // "Целочисленная арифметика"
        int a = 1 + 2;
        int b = a * 5 + 8;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);

        // тип double
        double ad = 1 + 2;
        double bd = ad * 5;
        double cd =  bd / 7;
        double dd = cd - a;
        double ed = - dd;
        System.out.println(ad + " " + bd + " " + cd + " " + ed);
    }
}
