package ru.javalang.module11.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04FileInputOutputStream {
    public static void main(String[] args) throws IOException {
        // Поток на чтение байт из файла (если под Windows, должно быть "c:/test/data1.txt")
        FileInputStream inputStream = new FileInputStream("/home/user/java/file04.txt");
        // Поток на запись байт в файл
        FileOutputStream outputStream = new FileOutputStream("/home/user/java/file041.txt");

        // Массив 1000 байт
        byte[] b = new byte[1000];

        int str;
        // Цикл чтения байт из входного потока, пока есть еще непрочитанные байты
        while (inputStream.available() > 0){

            // Поблочное чтение и передача в переменную
            str = inputStream.read();

            // Поблочная запись в поток вывода
            outputStream.write(str);
        }

        // Закрытие потоков
        inputStream.close();
        outputStream.close();
    }
}
