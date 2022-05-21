package ru.javalang.module17.callback;

public class Callback {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        MyClass myClass = new MyClass();

        someClass.registerCallback(myClass);
        someClass.doSomething();
    }
}
