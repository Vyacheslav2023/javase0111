package ru.javalang.module06;

/**
 * Пример класса с аттрибутами и методом
 */

public class Sample602 {

    private int x; // переменная экземпляра класса

    private int y = 71; // переменная экземпляра класса

    public final int CURRENT_YEAR = 2022; // константа

    static String version = "Java SE 17"; // переменная класса

    public int method(int z) { // параметр метода

        z++;

        int a; // локальная переменная метода

        x++; // инкримент переменной экземпляра класса

        // a++; // ошибка компиляции, значение не задано

        a = 4; // инициализация

        a++; // инкримент переменной метода

        return a + x + y + z;
    }
}
