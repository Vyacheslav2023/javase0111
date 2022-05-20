package ru.javalang.module10;

public class Sample1003throw {
    public static void main(String[] args) {
        try {
            throw new NullPointerException("Генерация исключения");
        }
        catch (NullPointerException e) {
            System.out.println("перехватили исключение: " + e);
            throw e;
        }

//        System.out.println("Программа продолжается");
    }
}
