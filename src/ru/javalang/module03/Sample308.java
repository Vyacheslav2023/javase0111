package ru.javalang.module03;

/**
 * Цикл for
 *
 * Общая форма:
 * for(инициализация; условие; итерация;) {
 *     //тело
 * }
 */
public class Sample308 {
    public static void main(String[] args) {

        int i = 0;
        // Реализация for как while
        for( ; i < 10; ){
            System.out.print("i = " + ++i + ", ");
        }

        System.out.println();
        // Обычная форма использования for
        for (int j = 0; j < 10; j++) {
            System.out.print("j = " + ++j + ", ");
        }
    }
}
