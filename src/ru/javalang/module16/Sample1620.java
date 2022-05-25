package ru.javalang.module16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream API
 */
public class Sample1620 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Ten");
        Stream stream = list.stream();
        stream.filter(x-> x.toString().length() == 3).forEach(System.out::println);
    }
}
