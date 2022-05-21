package ru.javalang.module11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sample1106 {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        try {
            ObjectOutputStream out = new
                    ObjectOutputStream(new
                    FileOutputStream("/home/user/java/out.bin"));
            out.writeObject(values);
            out.close();
        }
        catch(IOException e) {
            System.out.println("Some error occurred!");
        }
    }
}
