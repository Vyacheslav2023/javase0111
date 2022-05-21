package ru.javalang.module11.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo09SerialInput {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("/home/user/java/carserial.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        CarSerial car1;

        Object object = objectInputStream.readObject();

        if(object instanceof CarSerial)
            car1 = (CarSerial) object;
        else
            throw new IllegalArgumentException("Тип объекта не соответствует");

        System.out.println(car1.getName());
        System.out.println(car1.getColor());
        System.out.println(car1.getType());
        System.out.println(car1.getAge());

        objectInputStream.close();
        fileInputStream.close();
    }
}
