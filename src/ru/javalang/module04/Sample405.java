package ru.javalang.module04;

/**
 * Многомерный массив (двумерный)
 * Массив массивов
 */
public class Sample405 {
    public static void main(String[] args) {

        int[][] twoDimArray = new int[4][5];

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = i*twoDimArray[i].length + j + 1;
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
