package ru.javalang.module16;

interface GetIntValue{
    int get();
}

interface GetDoubleValue{
    double get();
}

public class Sample1601 {
    public static void main(String[] args) {

        GetIntValue getIntValue = ()->10;
        System.out.println(getIntValue.get());

        GetDoubleValue getDoubleValue = ()-> 15.25;
        System.out.println(getDoubleValue.get());
    }
}
