package ru.javalang.module04;

/**
 * Ошибки времени выполнения
 *
 * несуществующие индексы массива
 */
public class Sample408 {
    public static void main(String[] args) {
        int array[] = new int[] { 1, 2, 3 };
        System.out.println(array[3]);
    }
}
