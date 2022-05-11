package ru.javalang.module04;

/**
 * Math.random()
 */
public class Sample404 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        int minRange = 10, maxRange = 20;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = minRange + (int)(Math.random() * (maxRange-minRange));
        }

        for( int x : arr) System.out.print(x + " ");
    }
}
