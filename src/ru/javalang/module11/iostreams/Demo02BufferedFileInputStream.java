package ru.javalang.module11.iostreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo02BufferedFileInputStream {
    public static void main(String[] args) throws IOException {

        // Поток на чтение байт из файла (если под Windows, должно быть "c:/java/file1.txt")
        FileInputStream inputStream = new FileInputStream("/home/user/java/file02.txt");

        //Буферизованный поток, по N-байт
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 1024);

        // Размер данных в байтах
        int dataLength = bufferedInputStream.available();

        int str;
        while ((str = bufferedInputStream.read()) != -1){
            char cStr = (char) str;
            System.out.print(cStr);
        }

        //Закрытие потока
        inputStream.close();
    }
}
