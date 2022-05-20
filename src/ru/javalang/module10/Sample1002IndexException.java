package ru.javalang.module10;

import java.util.Scanner;

public class Sample1002IndexException {
    public static void main(String[] args) {
        int[] m = {-1,0,1};
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            m[a] = 4 / a;
        } catch (ArithmeticException e ){
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException a){
            a.printStackTrace();
        }
    }
}
