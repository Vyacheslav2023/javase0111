package ru.javalang.module14;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class Sample1413MapEntry {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        Iterator iter = props.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

//        props.forEach((k,v)-> System.out.println(k + " -- " + v));
    }
}
