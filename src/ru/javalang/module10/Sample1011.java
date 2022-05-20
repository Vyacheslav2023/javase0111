package ru.javalang.module10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample1011 {
    public static void main(String[] args) {
        String s = input();
        System.out.println(s);
    }

    public static String input() {
        String s = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            s = reader.readLine();
            if(s.equals("")) throw new IOException("ОШИБКА!!! Пустая строка!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return s;
    }
}
