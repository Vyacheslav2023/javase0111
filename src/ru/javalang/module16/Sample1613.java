package ru.javalang.module16;

import java.util.function.Function;

/**
 * Function<T,R>
 * Функциональный интерфейс Function<T,R> представляет функцию перехода от объекта типа T к объекту типа R
 *
 * interface Function<T, R> {
 *     R apply(T t);
 * }
 */

public class Sample1613 {
    public static void main(String[] args) {
        Function<Integer, String> convert = x-> String.valueOf(x) + " долларов";
        System.out.println(convert.apply(5)); // 5 долларов
    }
}
