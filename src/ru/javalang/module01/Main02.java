package ru.javalang.module01;

import java.io.PrintStream;

/**
 * Пример программы со статитечской переменной
 * типа PrintStream
 * для вывода данных на терминал
 */

public class Main02 {

    // Статическая переменная для вывода данных
    static PrintStream out = System.out;

    public static void main(String[] args) {
        out.println("Привет! Вывод из переменной типа PrintStream.");
    }
}
