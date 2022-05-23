package ru.javalang.module16;

interface SomeFunction2<T,U>{
    U func(T t);
}

public class Sample1603 {
    public static void main(String[] args) {
        SomeFunction2<Integer, String> checkOddEven = n-> n + " - " + (n%2==0?"Четное":"Нечетное");

        System.out.println(checkOddEven.func(10));
        System.out.println(checkOddEven.func(11));
    }
}
