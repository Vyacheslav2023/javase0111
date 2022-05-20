package ru.javalang.module10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Sample1007file {
    public static void main(String[] args) {
        FileInputStream fileStream = null;
        try {
            fileStream=new FileInputStream("/home/gorynych/java/file.txt");
            while (fileStream.available()>0){
                int b = fileStream.read();
                System.out.print((char)b + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileStream != null) {
                try {
                    fileStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
