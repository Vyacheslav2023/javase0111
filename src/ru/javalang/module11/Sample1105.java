package ru.javalang.module11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample1105 {
    public static void main(String[] args) {
        int[] values = new int[5];
        try {
            BufferedReader in = new BufferedReader(new
                    FileReader("in.txt")); //InputStreamReader(System.in));
            for (int i = 0; i < values.length; i++) {
                values[i] = Integer.parseInt(in.readLine());
            }
            in.close();
        }
        catch(IOException e) {
            System.out.println("Some error occurred!");
        }
    }
}
