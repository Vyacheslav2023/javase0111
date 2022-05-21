package ru.javalang.module11;

import java.io.IOException;

/**
 * Чтение символов из потока вводоа
 */

public class Sample1101 {
    public static void main(String[] args) {
        int x;
        System.out.println("Введите символ в коммандную строку:");
        try {
            x = System.in.read();
            char c = (char) x;
            System.out.println("Код символа " + c + " = " + x);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
