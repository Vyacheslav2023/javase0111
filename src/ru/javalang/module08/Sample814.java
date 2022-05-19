package ru.javalang.module08;

@FunctionalInterface
interface Converter {
    double intToDouble(int a);
}

public class Sample814 {
    public static void main(String[] args) {

        Converter converter = x -> (double) x;

        double y = converter.intToDouble(10);

    }
}
