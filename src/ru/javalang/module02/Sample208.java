package ru.javalang.module02;

/**
 * Объекты (типы) упаковка - распаковка примитивных типов данных
 */
public class Sample208 {
    public static void main(String[] args) {
        int i = 2;
        Integer j = i; // создание объекта-упаковки
        Integer k = ++j; // распаковка+операция+упаковка
        k = i + j + k;
        System.out.println(k);
    }
}
