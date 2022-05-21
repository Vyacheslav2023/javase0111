package ru.javalang.module11.serializable;

import java.io.FileOutputStream;

public class Demo06SimpleOutputSerial {
    public static void main(String[] args) throws Exception {

        CarSaveLoad carSaveLoad = new CarSaveLoad("Audi",10);
        carSaveLoad.setType("sedan");
        carSaveLoad.setColor("black");

        FileOutputStream fileOutputStream = new FileOutputStream("/home/user/java/carSaveLoad1.txt");

        carSaveLoad.save(fileOutputStream);

        fileOutputStream.close();

    }

}
