package ru.javalang.module03;

/**
 * Цикл while и do..while
 */
public class Sample307 {
    public static void main(String[] args) {
        int i = 0;

        System.out.println("Инкремент:");
        while (i < 10)
            System.out.print("i = " + ++i + ", ");

        System.out.println("\nДекремент:");
        do{
            System.out.print("i = " + i-- + ", ");
        } while (i > 0);
    }
}
