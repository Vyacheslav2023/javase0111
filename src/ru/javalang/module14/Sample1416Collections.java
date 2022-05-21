package ru.javalang.module14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sample1416Collections {
    public static void main(String[] args) {
        List<String> list3
                = Arrays.asList("yellow", "red", "green", "blue");
        List<String> list4
                = Arrays.asList("yellow", "red", "green", "blue");
        Collections.shuffle(list3, new Random(20));
        Collections.shuffle(list4, new Random(30));
        System.out.println(list3);
        System.out.println(list4);
    }
}
