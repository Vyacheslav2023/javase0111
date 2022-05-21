package ru.javalang.module11.iostreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileReader & FileWriter - адаптеры между File и интерфейсами InputStream, OutputStream, Reader, Writer
 */
public class Demo05FileReaderWriter {
    public static void main(String[] args) throws IOException {

        FileReader[] fileReaders = new FileReader[] {
                new FileReader("/home/user/java/file01.txt"),
                new FileReader("/home/user/java/file02.txt"),
                new FileReader("/home/user/java/file03.txt"),
                new FileReader("/home/user/java/file04.txt"),
        };

        FileWriter fileWriter = new FileWriter("/home/user/java/file05.txt");

        for(FileReader fileReader: fileReaders) {
            while (fileReader.ready()) {
                int data = fileReader.read();
                fileWriter.write(data);
            }
            fileWriter.write("\n");
            fileReader.close();
        }

        fileWriter.close();
    }
}
