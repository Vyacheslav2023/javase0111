package ru.javalang.module11.serializable;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo07SimpleInputSerial {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("/home/user/java/carSaveLoad1.txt");

        CarSaveLoad carSaveLoad1 = new CarSaveLoad();
        carSaveLoad1.load(fileInputStream);

        System.out.println(carSaveLoad1.getName());
        System.out.println(carSaveLoad1.getAge());
        System.out.println(carSaveLoad1.getType());
        System.out.println(carSaveLoad1.getColor());

        fileInputStream.close();
    }
}
