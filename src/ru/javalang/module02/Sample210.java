package ru.javalang.module02;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Пример высокоточной арифметики
 */

public class Sample210 {
    public static void main(String[] args) {
        BigInteger numI1, numI2, bigNumI;
        BigDecimal numD1, numD2, bigNumD;
        numI1 = BigInteger.valueOf(100000000);// преобразование числа в большое
        // число
        numI2 = BigInteger.valueOf(200000);
        bigNumI = BigInteger.valueOf(1);
        for (int i = 0; i < 10000000; i++)
            bigNumI = bigNumI.add(numI1.multiply(numI2).multiply(numI2));
        System.out.println("bigNumI = " + bigNumI);
    }
}
