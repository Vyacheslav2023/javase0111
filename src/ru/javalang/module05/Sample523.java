package ru.javalang.module05;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample523 {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+").matcher("Today is sunny");
        while (m.find()){
            System.out.println(m.group());
        }
        int i = 0;
        while(m.find(i)){
            System.out.println(m.group() + " ");
            i++;
        }
    }
}
