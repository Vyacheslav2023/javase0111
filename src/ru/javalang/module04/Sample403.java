package ru.javalang.module04;

/**
 * Нахождение максимального и минимального значений в массиве целых чисел
 */
public class Sample403 {
    public static void main(String[] args) {
        int[] a = { 5, 10, 0, -5, 16, -2 };

        int max = a[0], min = a[0], maxi=0, mini=0;

        for (int i = 1; i < a.length; i++) {
            if(a[i] > max) { max = a[i]; maxi = i; }
            if(a[i] < min) { min = a[i]; mini=i; }
        }

        System.out.println("В ряду " + a.length
                + " элементов: максимум a[" + maxi + "] = " + max
                + ", минимум a[" + mini + "] = " + min);
    }
}
