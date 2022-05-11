package ru.javalang.module05;

import java.io.UnsupportedEncodingException;

public class Sample525 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "\u043A\u043E" + "\u0434\u0438\u0440\u043E\u0432" + "\u043A\u0430";
        System.out.println(str);
        byte[] b = str.getBytes("Cp866");
        String str2 = new String(b, "Cp866");
        System.out.println(str2);
    }
}
