package ru.javalang.module11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Sample1107 {
    public static void main(String[] args) {
        int[] values;
        try {
            ObjectInputStream in = new ObjectInputStream(new
                    FileInputStream("/home/user/java/out.bin"));
            values = (int[])in.readObject();
            in.close();
        }
        catch(IOException e) {
            System.out.println("Some error occurred!");
        }
        catch(ClassNotFoundException e) {
            System.out.println("Wrong object type");
        }
    }
}
