package ru.javalang.module04;

public class CalcualtorUtils {
    public int add (int a, int b) {
        return a + b;
    }
    public int sub (int a, int b) {
        return a - b;
    }

    public int multy (int a, int b) {
        return a * b;
    }
    public int divide (int a, int b)  {
        if(b==0) throw new ArithmeticException("Divide by null");
        return a/b;
    }

}
