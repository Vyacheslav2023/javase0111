package ru.javalang.module11.iostreams;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Поток ввода данных из файла
 */

public class Demo01FileInputStream {

    public static void main(String[] args) throws IOException {

        // Поток на чтение байт из файла (если под Windows, должно быть "c:/java/data1.txt")
        FileInputStream inputStream = new FileInputStream("/home/user/java/file03.txt");

        // Размер данных в байтах
        int dataLength = inputStream.available();

        int str;
        while (inputStream.available() > 0){
            // Поблочное чтение и передача в переменную
            str = inputStream.read();
            System.out.print((char)str);
        }

//        while ((str = inputStream.read()) != -1){
//            System.out.print((char)str);
//        }

        //Закрытие потока
        inputStream.close();
    }
}
