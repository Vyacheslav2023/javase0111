package ru.javalang.module16;

interface SomeFunction<T>{
    T func(T n);
}

public class Sample1602 {
    public static void main(String[] args) {
        SomeFunction<Integer> function1 = n->n+1;
        System.out.println(function1.func(10));

        SomeFunction<Double> function2 = n->5*n*n-8*n+3;
        System.out.println(function2.func(15.0));
    }
}
