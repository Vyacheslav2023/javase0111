package ru.javalang.module16;

import java.util.stream.Stream;

/**
 * findFirst() – вытаскивает первый элемент стрима
 * allMatch(Predicate predicate) — возвращает true, если все элементы стрима удовлетворяют условию. Если встречается какой-либо элемент, для которого результат вызова функции-предиката будет false, то оператор перестаёт просматривать элементы и возвращает false:
 * anyMatch(Predicate predicate) — вернет true, если хотя бы один элемент стрима удовлетворяет условию predicate
 * noneMatch(Predicate predicate) — вернёт true, если, пройдя все элементы стрима, ни один не удовлетворил условию predicate
 *
 */
public class Sample1626 {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 9).findFirst();
        Stream.of(1, 2, 3, 4, 9).allMatch(x -> x <= 7);//false
        Stream.of(1, 2, 3, 4, 9).anyMatch(x -> x >= 7);//true
        Stream.of(1, 2, 3, 4, 9).noneMatch(x -> x >= 7);//false
    }
}
