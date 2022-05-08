package ru.javalang.module02;

/**
 * Операции инкримента и декремента
 * префикс и постфикс
 */
public class Sample213 {
    public static void main(String[] args) {
        int a = 1, b = 0;
        System.out.println("b = " + b + ", a = " + a);
        b=++a;
        System.out.println("b = " + b + ", a = " + a);
        b=a++;
        System.out.println("b = " + b + ", a = " + a);
        b = --a;
        System.out.println("b = " + b + ", a = " + a);
        b = a--;
        System.out.println("b = " + b + ", a = " + a);
    }
}
