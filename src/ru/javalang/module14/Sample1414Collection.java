package ru.javalang.module14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample1414Collection {
    public static void main(String[] args) {
        List<String> list1
                = Arrays.asList("red", "greean", "blue");
        Collections.sort(list1);
        System.out.println(list1);
        List<String> list2
                = Arrays.asList("greean", "red", "yellow", "blue");
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);
    }
}
