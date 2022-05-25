package ru.javalang.module16;

import java.util.stream.Stream;

/**
 * reduce(T identity, BinaryOperator accumulator)
 * — преобразовывает все элементы стрима в один объект(посчитать сумму всех элементов, либо найти минимальный элемент), cперва берётся объект identity и первый элемент стрима, применяется функция accumulator и identity становится её результатом.
 * Затем всё продолжается для остальных элементов.
 *
 *
 */

public class Sample1625 {
    public static void main(String[] args) {
        int sum = Stream.of(1, 2, 3, 4, 5).reduce(10, (acc, x) -> acc + x);// = 25
        System.out.println(sum);
    }
}
