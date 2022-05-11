package ru.javalang.module05;

/**
 * Замена литералов в строках
 */

public class Sample503 {
    public static void main(String[] args) {
        String str = "Его зовут Вася и это все натворил Вася";
        String strreplace = "Коля";
        String result = str.replaceFirst("Вася", strreplace);
        System.out.println(result);
    }
}
