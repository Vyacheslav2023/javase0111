package ru.javalang.module15;

import ru.javalang.module15.enums.SingletonDemo;

public class Sample1502 {
    public static void main(String[] args) {
        SingletonDemo singletonDemo = SingletonDemo.INSTANCE;
        singletonDemo.method();
    }
}
