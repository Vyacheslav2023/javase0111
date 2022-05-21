package ru.javalang.module17.p03Factory;

//insert from
//http://stackoverflow.com/questions/12967896/converting-integers-to-roman-numerals-java

public class RomanNumbers {
    public static final int[] decimal = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    public static final String[] letters = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    public static String stringToRoman(int num) {
        String roman = "";

        if (num < 1 || num > 3999) {
            System.out.println("Invalid roman number value!");
        }

        while (num > 0) {
            int maxFound = 0;
            for (int i=0; i < decimal.length; i++) {
                if (num >= decimal[i]) {
                    maxFound = i;
                }
            }
            roman += letters[maxFound];
            num -= decimal[maxFound];
        }

        return roman;
    }
}