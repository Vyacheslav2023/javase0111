package ru.javalang.module11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sample1103 {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        try {
            PrintWriter out = new PrintWriter(new
                    BufferedWriter(new FileWriter("out.txt")));
            for (int i = 0; i < values.length; i++) {
                out.println(values[i]);
            }
            out.close();
        }
        catch(IOException e) {
            System.out.println("Some error occurred!");
        }
    }
}
