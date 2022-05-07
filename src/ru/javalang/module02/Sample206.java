package ru.javalang.module02;

/**
 * Примеры преобразования типов и потери точности данных
 */
public class Sample206 {
    public static void main(String[] args) {
        byte b = 10;
        long e1;
        e1 = b;

        long a = 10000000000L;
        int x;
        x = (int)a;
        System.out.println("1 - " + x);

        byte b5 = 50;
        //byte b4 = b5*2;
        byte b4 = (byte)(b5*2);

        byte b1=50, b2=20, b3=127;
        int x2 = b1*b2*b3;
        System.out.println("2 - " + x2);

        double d=12.34;
        int x3;
        x3 = (int)d;
        System.out.println("3 - " + x3);

        int x4 = 123456789;
        float f = x4;
        double d1 = x4;
        System.out.println("4 - " + f);
        System.out.println("5 - " + d1);

        float f2 = 1.234567890f;
        double d2 = f2;
        System.out.println("6 - " + d2);

        long l2 = 123456789L;
        float f3 = f2;
        System.out.println("7 - " + f3);
    }
}
