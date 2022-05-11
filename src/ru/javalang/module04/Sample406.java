package ru.javalang.module04;

public class Sample406 {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[5][];
        int secondDim=5, k=0;

        for (int i = 0; i < twoDimArray.length; i++) {
            twoDimArray[i] = new int[secondDim];
            for (int j = 0; j < secondDim; j++) {
                twoDimArray[i][j] = k++;
                System.out.print(twoDimArray[i][j] + " ");
            }
            secondDim--;
            System.out.println();
        }
    }
}
