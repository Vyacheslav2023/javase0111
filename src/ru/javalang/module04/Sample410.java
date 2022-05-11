package ru.javalang.module04;

import java.util.Arrays;

/**
 * Класс java.util.Arrays
 */

public class Sample410 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int minRange = 10, maxRange = 30;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = minRange + (int)(Math.random() * (maxRange-minRange));
        }
        System.out.println("Исходный массив:");
        for( int x : arr) System.out.print(x + " ");

        Arrays.sort(arr);

        System.out.println("\n\nПосле сортировки Arrays.sort()");
        System.out.println(Arrays.toString(arr));

        int m = minRange+(maxRange-minRange)/2;
        System.out.println("\n\nБинарный поиск элемента (min+(max-min)/2): " + m
                + ", индекс = " + Arrays.binarySearch(arr, m));

        Arrays.fill(arr, 0);

        System.out.println("\n\nПосле выполнения Arrays.fill()");
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, 0, arr.length/2, 1);

        System.out.println("\n\nПосле выполнения Arrays.fill(array, 0, array.length/2, 1)");
        System.out.println(Arrays.toString(arr));

        System.out.println("\n\nКопия половины массива Arrays.copyOf(arr,arr.length/2)");
        int[] arrcopy = Arrays.copyOf(arr,arr.length/2);
        System.out.println(Arrays.toString(arrcopy));

        System.out.println("\n\nУстановка значений по порядку Arrays.setAll(arr, i->1+i)");
        Arrays.setAll(arr, i->1+i);
        System.out.println(Arrays.toString(arr));

        arrcopy = Arrays.copyOf(arr,arr.length);
        System.out.println("\n\nСравнение массивов Arrays.equals(arr, arrcopy)");
        System.out.println(Arrays.equals(arr, arrcopy));
    }
}
