package ru.javalang.module11.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo08SerialOutput {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CarSerial car = new CarSerial("BMW", 10);
        car.setColor("white");
        car.setType("crossover");

        FileOutputStream fileOutputStream = new FileOutputStream("/home/user/java/carserial.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(car);

        objectOutputStream.close();
        fileOutputStream.close();
    }
}
