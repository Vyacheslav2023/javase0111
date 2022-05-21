package ru.javalang.module14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sample1404Iterator {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Berling");
        set.add("New York");
        System.out.println(set);
        // Obtain an iterator for the hash set
        Iterator iterator = set.iterator();
        // Display the elements in the hash set
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
