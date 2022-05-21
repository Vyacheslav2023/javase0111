package ru.javalang.module14;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sample1403TreeSet {
    public static void main(String[] args) {
        // Create a hash set
        Set<String> set = new HashSet<String>();
        // Add strings to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Berling");
        set.add("New York");
        TreeSet<String> treeSet = new TreeSet<String>(set);
        System.out.println(treeSet);
        // Display the elements in the hash set
        for (Object element : set)
            System.out.print(element.toString() + " ");
    }
}
