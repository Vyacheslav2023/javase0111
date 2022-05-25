package ru.javalang.module16;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * flatMap
 */
public class Sample1623 {
    public static void main(String[] args) {
        Stream.of(2, 3, 0, 1, 3)
                .flatMapToInt(x -> IntStream.range(0, x))
                .forEach(System.out::print);// 010120012
    }
}
