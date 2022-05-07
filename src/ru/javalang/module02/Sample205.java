package ru.javalang.module02;

/**
 * Правила продвижения типов данных
 * 1. все значения (byte),(short),(char) приводяться к (int)
 * 2. затем все выражение к (long), если один из них (long)
 * 3. если один из операндов (float), то к (float)
 * 4. если один из них (double), то все к (double)
 */
public class Sample205 {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.87f;
        double d = .1234;
        double result = (f*b) + (i/c) - (d*s);
        System.out.println("(f*b) + (i/c) - (d*s) = " + result);

    }
}
