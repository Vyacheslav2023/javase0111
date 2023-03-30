package ru.javalang.module10.tasks.t02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fl = new FileInputStream("/home/file.txt");
            while (fl.available() > 0) {
                int b = fl.read();
                System.out.print((char) b + " ");
            }
        }
        catch (FileNotFoundException eee) {System.out.println("Oshibka: " + eee);}
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ok");
        }
    }
}

