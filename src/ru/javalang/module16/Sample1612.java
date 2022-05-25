package ru.javalang.module16;

import java.util.function.UnaryOperator;

/**
 * UnaryOperator<T>
 * UnaryOperator<T> принимает в качестве параметра объект типа T,
 * выполняет над ними операции и возвращает результат операций в виде объекта типа T
 *
 * interface UnaryOperator<T> {
 *     T apply(T t);
 * }
 */
public class Sample1612 {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x*x;
        System.out.println(square.apply(5)); // 25
    }
}
