package ru.javalang.module14;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sample1402LinkedHashSet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        // Add strings to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Berling");
        set.add("New York");
        System.out.println(set);
        // Display the elements in the hash set
        for (Object element : set)
            System.out.print(element.toString() + " ");
    }
}
