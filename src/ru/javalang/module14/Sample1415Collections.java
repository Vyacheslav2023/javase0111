package ru.javalang.module14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample1415Collections {
    public static void main(String[] args) {
        List<String> list1
                = Arrays.asList("yellow", "red", "green", "blue");
        Collections.reverse(list1);
        System.out.println(list1);
        List<String> list2
                = Arrays.asList("yellow", "red", "green", "blue");
        Collections.shuffle(list2);
        System.out.println(list2);
    }
}
