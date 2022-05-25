package ru.javalang.module16;

import java.util.function.BinaryOperator;

/**
 * BinaryOperator<T>
 * BinaryOperator<T> принимает в качестве параметра два объекта типа T,
 * выполняет над ними бинарную операцию и возвращает ее результат также в виде объекта типа T
 *
 * interface BinaryOperator<T> {
 *     T apply(T t1, T t2);
 * }
 */

public class Sample1611 {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (x, y) -> x*y;

        System.out.println(multiply.apply(3, 5)); // 15
        System.out.println(multiply.apply(10, -2)); // -20
    }
}
