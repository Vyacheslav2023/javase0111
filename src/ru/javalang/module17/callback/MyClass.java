package ru.javalang.module17.callback;

public class MyClass implements SomeClass.Callback {
    @Override
    public void callingBack(String s) {
        if (s != null)
            System.out.println("Answer " + s);
        else System.out.println("Answer is empty");
    }
}
