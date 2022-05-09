package ru.javalang.module03;

/**
 * Оператор continue
 */
public class Sample311 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if(i%2==0) continue;
            System.out.println();
        }
    }
}
