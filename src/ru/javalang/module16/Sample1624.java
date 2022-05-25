package ru.javalang.module16;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * collect(Collector collector) – метод собирает все элементы в список, множество или другую коллекцию, сгруппировывает элементы по какому-нибудь критерию, объединяет всё в строку и т.д.:
 */
public class Sample1624 {
    public static void main(String[] args) {
        List<String> list = Stream.of("One", "Two", "Three").collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
