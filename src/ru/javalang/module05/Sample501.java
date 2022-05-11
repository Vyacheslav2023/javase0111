package ru.javalang.module05;

import java.io.UnsupportedEncodingException;

/**
 * Примеры создания строк
 */
public class Sample501 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str1 = new String();

        char[] data1 = { 'a', 'b', 'c', 'd', 'e', 'f' };
        String str2 = new String(data1, 2, 3);
        System.out.println(str2);

        char[] data2 = { '\u004A', '\u0062', 'V', 'A' };
        String str3 = new String(data2);
        System.out.println(str3);

        byte ascii[] = { 65, 66, 67, 68, 69, 70 };
        String str4 = new String(ascii); // ”ABCDEF”
        System.out.println(str4);

        byte[] data3 = { (byte) 0xE3, (byte) 0xEE };

        String str5 = new String(data3, "CP1251");// ”го”
        String str6 = new String(data3, "CP866");// ”ую”

        System.out.println(str5);
        System.out.println(str6);
    }
}
