package ru.javalang.module11;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample1104 {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream("out.bin"));
            for (int i = 0; i < values.length; i++) {
                out.writeInt(values[i]);
            }
            out.close();
        }
        catch(IOException e) {
            System.out.println("Some error occurred!");
        }
    }
}
