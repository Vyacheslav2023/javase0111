package ru.javalang.module14;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sample1401Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Berling");
        set.add("New York");
        System.out.println(set);
        for (Object element : set)
            System.out.print(element.toString());
    }
}
