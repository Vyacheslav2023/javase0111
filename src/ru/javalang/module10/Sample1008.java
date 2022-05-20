package ru.javalang.module10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Sample1008 {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("/home/gorynych/java/file.txt")) {
            while (fis.available()>0){
                int b = fis.read();
                System.out.print((char)b + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
