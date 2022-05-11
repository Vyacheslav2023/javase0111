package ru.javalang.module05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample522 {
    public static void main(String[] args) {
        String text = "Вася Иванович Пупкин";
        Pattern pattern = Pattern.compile("И.+п");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("matcher.start(): " + matcher.start());
            System.out.println("matcher.end(): " + matcher.end());
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
