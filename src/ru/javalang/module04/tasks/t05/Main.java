package ru.javalang.module04.tasks.t05;

/**
 * Напишите программу, которая выполняет "сжатие массива целых чисел" –
 *  переставляет все нулевые элементы в конец.
 *  При этом все ненулевые элементы располагаются в начале в том же порядке.
 *
 *  Input	            Result
 *  6
 *  1 0 2 0 3 4         1 2 3 4 0 0
 */

public class Main {
    public static void main(String[] args) {

        int n = 10;
        int[] m = new int[n];
        int[] mm = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = (int) (Math.random() * 100) * (int) (Math.random() + 0.5);
            System.out.print(m[i] + " ");
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (m[i] == 0) {
                m[j] = 0;
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (m[i] != 0) {
                m[j] = m[i];
                j++;
            }
        }
    }
    }

