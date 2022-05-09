package ru.javalang.module03;

/**
 * Испльзование break метка;
 * замена goto
 */
public class Sample310 {
    public static void main(String[] args) {
        outer: for (int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
              if(j == 10) break outer;
                System.out.print(j + " ");
            }
            System.out.println("Эта строка не выведется");
        }
        System.out.println("\nПрограмма завершена");
    }
}
