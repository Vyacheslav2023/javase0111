package ru.javalang.module02;

/**
 * Пример статического импорта методов из библиотека Math
 */

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Sample212 {

    public static void main(String[] args) {
        int i = 20, j = 40;
        double x = pow(i,2);
        double y = sqrt(j)/2;
        System.out.println("x = " + x + " y = " + y);
    }
}
