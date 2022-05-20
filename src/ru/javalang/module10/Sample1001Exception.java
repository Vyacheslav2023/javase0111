package ru.javalang.module10;

public class Sample1001Exception {
    public static void main(String[] args) {
        int a = 10, b=0, z;
        try {
            z = a/b;
        } catch (Exception e) {
            System.out.println("Возникла ошибка! Деление на НОЛЬ! НЕЛЬЗЯ!");
        }
        System.out.println("Продолжение выполнения программы!");
    }
}
