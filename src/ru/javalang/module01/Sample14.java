package ru.javalang.module01;

import java.io.IOException;

/**
 * Пример ввода символа при помощи метода System.in.read()
 */

public class Sample14 {
    public static void main(String[] args) {

        //Объявление переменных
        int n;
        char c;

        System.out.print("Введите символ: ");

        // Блок try-catch для обработки ввода символа с клавиатуры
        try {
            n = System.in.read();
            c = (char) n;
            System.out.println("Код символа '" + c + "' = " + n);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
