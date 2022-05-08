package ru.javalang.module02;

/**
 * Операция с присваиванием
 */

public class Sample216 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        a+=5;
        b *= 4;
        c += a * b;
        c %= 6;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
