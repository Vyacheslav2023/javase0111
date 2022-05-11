package ru.javalang.module05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample524 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("J2SE");

        String candidateString_1 = "J2SE is the only one for me";
        String candidateString_2 = "For me, it's J2SE, or nothing at all";
        String candidateString_3 = "J2SEistheonlyoneforme";

        Matcher matcher = p.matcher(candidateString_1);
        String msg = ":" + candidateString_1 + ": matches?: ";
        System.out.println(msg + matcher.lookingAt());
        matcher.reset(candidateString_2);
        msg = ":" + candidateString_2 + ": matches?: ";
        System.out.println(msg + matcher.lookingAt());

        matcher.reset(candidateString_3);
        msg = ":" + candidateString_3 + ": matches?: ";
        System.out.println(msg + matcher.lookingAt());
    }
}
