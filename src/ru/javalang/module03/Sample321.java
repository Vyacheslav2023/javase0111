package ru.javalang.module03;

/**
 * Переопределение методов
 * для вычисления разных типов данных
 */
public class Sample321 {
    public static void main(String[] args) {

        System.out.println("Сумма целых чисел: " + sum(10,20));
        System.out.println("Сумма вещественных чисел: " + sum(50.5,75.7));
        System.out.println("Сумма множества вещественных чисел: " + sum(50.5,75.7, 32.2, 54.9));
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static double sum(double x, double y){
        return x + y;
    }

    public static double sum(double... x){
        double s = 0;
        for (int i = 0; i < x.length; i++) {
            s += x[i];
        }
        return s;
    }
}
